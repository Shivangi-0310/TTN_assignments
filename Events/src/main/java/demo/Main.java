package demo;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Employee-Config.xml");
        context.start();
        Employee employee = context.getBean(Employee.class);
        employee.printEmployeeDetails();
        context.stop();
        System.out.println("-------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------");
        context.start();
        Student student = context.getBean(Student.class);
        student.printStudentDetails();
        context.stop();
        context.close();

        
    }
}
