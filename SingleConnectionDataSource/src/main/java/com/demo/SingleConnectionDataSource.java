package com.demo;
// Question 4. SingleConnectionDataSource to print the records of user tables.
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
@Service
public class SingleConnectionDataSource {
    @Autowired
    DataSource dataSource;
    void getConnection() throws Exception{
        Connection connection= dataSource.getConnection();
        PreparedStatement preparedStatement= connection.prepareStatement("SELECT * from user ");
        ResultSet resultSet= preparedStatement.executeQuery();
        while (resultSet.next())
        {
            System.out.print(resultSet.getString("username"));
            System.out.print(" ");
            System.out.print(resultSet.getString("password"));
            System.out.print(" ");
            System.out.print(resultSet.getString("name"));
            System.out.print(" ");
            System.out.print(resultSet.getInt("age"));
            System.out.print(" ");
            System.out.print(resultSet.getDate("dob"));
            System.out.print(" ");
            System.out.println(" ");
        }
    }

}
