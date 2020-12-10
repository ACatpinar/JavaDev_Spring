package com;

import com.Interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        Course course = container.getBean("java",Course.class);
        course.getTeachingHours();

        Course course1 = container.getBean("selenium",Course.class);
        course1.getTeachingHours();



    }
}
