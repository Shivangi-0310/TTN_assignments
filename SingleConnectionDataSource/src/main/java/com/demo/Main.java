package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Main {
    @Autowired
    SingleConnectionDataSource singleConnectionDataSource;

    public static void main(String[] args) throws Exception {
        ApplicationContext applicationContext=
                new ClassPathXmlApplicationContext("SingleDataSource-config.xml");
        SingleConnectionDataSource singleConnectionDataSource = applicationContext.getBean(SingleConnectionDataSource.class);
        singleConnectionDataSource.getConnection();
    }
}
