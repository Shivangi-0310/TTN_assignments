package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import java.sql.SQLException;

@Component
public class Main {
    @Autowired
    PooledConnection pooledConnection;

    public static void main(String[] args) throws SQLException {
        ApplicationContext applicationContext=
                new ClassPathXmlApplicationContext("PooledDatasource-config.xml");
        PooledConnection pooledConnection= applicationContext.getBean(PooledConnection.class);
        pooledConnection.getConnection();
    }

}
