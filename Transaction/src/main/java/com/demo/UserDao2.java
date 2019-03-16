package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Repository
public class UserDao2 {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Transactional(propagation = Propagation.REQUIRED,noRollbackFor = RuntimeException.class)
    //@Transactional(propagation = Propagation.REQUIRES_NEW)
    //@Transactional(propagation = Propagation.NESTED)
    // @Transactional(propagation = Propagation.MANDATORY)
    //@Transactional(propagation = Propagation.SUPPORTS)
    //@Transactional(propagation = Propagation.NOT_SUPPORTED)
    public void insert() {

        String sql = "INSERT INTO user (username,password,name,age,dob)VALUES(?,?,?,?,?)";
        jdbcTemplate.update(sql, new Object[]{
                "chotu", "346", "xyz", 22, new Date()
        });
        //comment to check mandatory and never
        throw new RuntimeException();
    }
}
