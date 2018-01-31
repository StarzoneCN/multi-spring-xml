package com.example.spring.mvc.jdbc.rdbms;

import com.example.spring.mvc.entity.User;
import org.springframework.jdbc.object.MappingSqlQuery;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 定制关系映射查询
 *
 * @author: LiHongxing
 * @date: Create in 2018-01-31 13:29
 * @modefied:
 */
public class CustomMappingQuery extends MappingSqlQuery<User> {

    public CustomMappingQuery(){}

    public CustomMappingQuery(DataSource ds, String sql) {
        super(ds, sql);
    }


    @Override
    protected User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User user = new User();
        user.setAge(rs.getInt("age"));
        user.setId(rs.getInt("id"));
        user.setMan(rs.getBoolean("man"));
        user.setName(rs.getString("name"));
        user.setPassword(rs.getString("password"));
        user.setStudent(rs.getBoolean("student"));
        return user;
    }
}
