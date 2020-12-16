package com.demo;

import com.demo.interfaces.Course;
import com.demo.interfaces.ExtraSessions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring07SpringBootDemoApplication {



	public static void main(String[] args) {
		ApplicationContext container = SpringApplication.run(Spring07SpringBootDemoApplication.class, args);

		Course course = container.getBean("java",Course.class);
		System.out.println("Java weekly teaching hours: "+course.teachingHours());

		Course course1 = container.getBean("selenium", Course.class);

		System.out.println("Selenium weekly teaching hours: "+course1.teachingHours());


	}

}




