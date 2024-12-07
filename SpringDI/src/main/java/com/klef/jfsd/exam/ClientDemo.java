package com.klef.jfsd.exam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Demonstrating Constructor Dependency Injection
        Employee employee = (Employee) context.getBean("employee");
        System.out.println("Constructor Dependency Injection:");
        System.out.println(employee);

        // Demonstrating Setter Autowiring
        Course course = (Course) context.getBean("course");
        System.out.println("\nSetter Autowiring:");
        System.out.println(course);
    }
}
