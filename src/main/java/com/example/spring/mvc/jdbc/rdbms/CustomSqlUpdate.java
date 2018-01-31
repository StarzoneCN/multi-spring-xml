package com.example.spring.mvc.jdbc.rdbms;

import org.springframework.jdbc.object.SqlUpdate;

import javax.sql.DataSource;

/**
 * spring-jdbc的update操作
 *
 * @author: LiHongxing
 * @date: Create in 2018-01-31 17:03
 * @modefied:
 */
public class CustomSqlUpdate extends SqlUpdate {

    public CustomSqlUpdate(DataSource ds, String sql) {
        super(ds, sql);
    }
}
