package com.demo;
// Question 3  Use datasource with dbcp2.BasicDataSource.
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@Service
public class PooledConnection {
    @Autowired
    DataSource dataSource;
    void getConnection() throws SQLException{
        Connection connection= dataSource.getConnection();
        Statement statement = connection.createStatement();
        String sql = "INSERT INTO user " +
                "VALUES ('Yashu','12345', 'm.tech', 23, '1995-10-10' )";
        statement.executeUpdate(sql);
        
    }


}
