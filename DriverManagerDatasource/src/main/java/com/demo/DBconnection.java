package com.demo;
// 3. Use datasource with DriverManagerDataSource

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Service
public class DBconnection {
    @Autowired
    DataSource dataSource;
    void getConnection() throws SQLException {
        Connection connection= dataSource.getConnection();
        PreparedStatement preparedStatement= connection.prepareStatement("SELECT * from user ");
        ResultSet resultSet= preparedStatement.executeQuery();
        while (resultSet.next())
        {
            System.out.println(resultSet.getString("username"));
            System.out.println(resultSet.getString("password"));
            System.out.println(resultSet.getString("name"));
            System.out.println(resultSet.getInt("age"));
            System.out.println(resultSet.getDate("dob"));
        }
    }

}
