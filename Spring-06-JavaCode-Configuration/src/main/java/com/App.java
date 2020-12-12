package com;

import com.configs.ApplicationConfig;
import com.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ApplicationConfig.class);   // we need to add ComponentScan to the ApplicationConfig class

        Course course = container.getBean("java",Course.class);

         //course.getTeachingHours();  //"No bean named 'java' available"  -- @Component should be referred at java and selenium class after we configure in config class

        course.getTeachingHours(); // 30

        Course course1 = container.getBean("selenium",Course.class);

        course1.getTeachingHours();  // 25




    }
}
