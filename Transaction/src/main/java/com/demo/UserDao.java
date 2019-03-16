package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.Date;

//Question 12. Use @Transactional to save to save 2 records using jdbc template with the following prapogation options
//
//        REQUIRED
//        REQUIRES_NEW
//        NESTED
//        MANDATORY
//        NEVER
//        NOT_SUPPORTED
//        SUPPORTS
//
// Question 12. Demonstrate the use of following options of @Transactional annotation
//
//        read-only
//        timeout
//        rollback-for
//        no-rollback-for




@Repository
public class UserDao {
    @Autowired
    DataSource dataSource;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    UserDao2 userDao2;

    @Transactional(propagation = Propagation.REQUIRED,timeout = 2,rollbackFor = IndexOutOfBoundsException.class)
    public void insert() {
/*  //for timeout
        try {
            Thread.sleep(3000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        String sql = "INSERT INTO user (username,password,name,age,dob)VALUES(?,?,?,?,?)";
        jdbcTemplate.update(sql, new Object[]{
                "akki", "1283", "efg", 17, new Date()
        });
        try {
            userDao2.insert();
        } catch (Exception ex) {
            System.out.println("userdao2 exception in userdao 1");
        }

        readOnlyDemo();
    }

    @Transactional(propagation = Propagation.REQUIRED,readOnly=true)
    public void readOnlyDemo(){
        String sql = "INSERT INTO user (username,password,name,age,dob)VALUES(?,?,?,?,?)";
        jdbcTemplate.update(sql, new Object[]{
                "john", "47465", "mno", 30, new Date()
        });
    }
}