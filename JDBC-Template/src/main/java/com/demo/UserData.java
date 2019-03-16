package com.demo;

// Question 5 Use JdbcTemplate to get the count of users
// Question 6 Get name of the user by providing username to the parametrized query
// Question 7 Insert one record using JdbcTemplate
//  Question 8 Use QueryForMap to fetch the user details of the user
//  Question 9 Use QueryForList to fetch records of all users
//  Question 10 Use a rowmapper to get the User object when you query for a user
//  Question 11 Integrate Hibernate with Spring and use hql query to count the number of records in user table.


import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class UserData {


    @Autowired
    DataSource dataSource;
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    SessionFactory sessionFactory;

    void countUser() {
        System.out.println("Use JdbcTemplate to get the count of users:::");
        String statement = "Select count(*) from user";
        System.out.println("Total users are : " + jdbcTemplate.queryForObject(statement, Integer.class));
    }

    String getUserName() {
        System.out.println(" Get name of the user by providing username to the parametrized query:::");
        String statement = "SELECT USERNAME FROM user WHERE name = ?";
        return "username: " + jdbcTemplate.queryForObject(statement, new Object[]{"biotech"}, String.class);
    }

    void insertUser(User user) {
        System.out.println("Insert one record using JdbcTemplate:::");
        String statement = "Insert into user (username,password,name,age,dob)values(?,?,?,?,?)";
        jdbcTemplate.update(statement, new Object[]{
                user.getUsername(), user.getPassword(), user.getName(), user.getAge(), user.getDob()
        });
    }

    void queryForMapUser() {
        System.out.println(" Use QueryForMap to fetch the user details of the  user:::");
        String statement = "select * from user where name =?";
        System.out.println(jdbcTemplate.queryForMap(statement, new Object[]{"samy"}));
    }

    void listUser() {
        System.out.println("Use QueryForList to fetch records of all users:::");
        String statement = "select * from user";
        System.out.println(jdbcTemplate.queryForList(statement));
    }

    User getUser() {
        System.out.println("Use a rowmapper to get the User object when you query for a user:::");
        String statement = "Select * from user where name = ?";
        return jdbcTemplate.queryForObject(statement, new Object[]{"biotech"}, new UserMapper());
    }

    void hqlDemo() {
        System.out.println("Integrate Hibernate with Spring and use hql query to count the number of records in user table:::");
        String statement = "SELECT COUNT(*) FROM User";
        Query query = sessionFactory.openSession().createQuery(statement);
        System.out.println("User count from hibernate:>>> " + query.uniqueResult());
    }
}
