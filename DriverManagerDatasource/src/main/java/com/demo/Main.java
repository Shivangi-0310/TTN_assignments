package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
 @Component
public class Main {
    @Autowired
    DBconnection dBconnection;

    public DBconnection getdBconnection() {
        return dBconnection;
    }

    public static void main(String[] args) throws SQLException {
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("Datasource-config.xml");
        DBconnection dBconnection= applicationContext.getBean(DBconnection.class);
        dBconnection.getConnection();
        // DBconnection dBconnection= applicationContext.getBean(Main.class).getdBconnection();


    }
}
