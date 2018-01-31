package com.example.spring.mvc.controller;

import com.example.spring.mvc.entity.User;
import com.example.spring.mvc.jdbc.rdbms.CustomMappingQuery;
import com.example.spring.mvc.jdbc.rdbms.CustomSqlUpdate;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Types;
import java.util.*;

/**
 * spring-jdbc源码研究
 *
 * @author: LiHongxing
 * @date: Create in 2018-01-31 14:47
 * @modefied:
 */
@RestController
@RequestMapping("jdbc")
public class SpringJdbcController {
    @Resource
    private DataSource dataSource;

    @RequestMapping("/id/{id}")
    public User getById(@PathVariable("id") Integer id) {
        String sql = "select * from user where id = &id";
        Map<String, Object> params = new HashMap<>(2);
        params.put("id", id);

        List<SqlParameter> sqlParameters = new ArrayList<>(2);
        SqlParameter sqlParameter = new SqlParameter("id", Types.INTEGER);
        sqlParameters.add(sqlParameter);
        List<User> users = queryByParams(sqlParameters, params, sql);
        if (users != null && users.size() > 0) {
            return users.get(0);
        }
        return new User();
    }

    @RequestMapping("addUser")
    public Integer insert(User user) {
        String sql = "insert into user(name, man, age, student) values(:name, :man, :age, :student)";
        Map<String, Object> params = new HashMap<>(2);
        params.put("name", user.getName());
        params.put("man", user.isMan());
        params.put("age", user.getAge());
        params.put("student", user.isStudent());

        List<SqlParameter> sqlParameters = new ArrayList<>(2);
        SqlParameter sp1 = new SqlParameter("name", Types.NVARCHAR);
        SqlParameter sp2 = new SqlParameter("man", Types.BIT);
        SqlParameter sp3 = new SqlParameter("age", Types.INTEGER);
        SqlParameter sp4 = new SqlParameter("student", Types.BIT);
        sqlParameters.add(sp1);
        sqlParameters.add(sp2);
        sqlParameters.add(sp3);
        sqlParameters.add(sp4);
        return update(sqlParameters, params, sql);
    }

    public List<User> queryByParams(List<SqlParameter> sqlParameters, Map<String, Object> params, String sql) {
        CustomMappingQuery customMappingQuery = new CustomMappingQuery(dataSource, sql);
        customMappingQuery.setParameters(sqlParameters.toArray(new SqlParameter[sqlParameters.size()]));
        List<User> users = customMappingQuery.executeByNamedParam(params);
        if (users == null) {
            return Collections.emptyList();
        }
        return users;
    }

    public Integer update(List<SqlParameter> sqlParameters, Map<String, Object> params, String sql) {
        CustomSqlUpdate customSqlUpdate = new CustomSqlUpdate(dataSource, sql);
        customSqlUpdate.setParameters(sqlParameters.toArray(new SqlParameter[sqlParameters.size()]));
        return customSqlUpdate.updateByNamedParam(params);
    }
}
