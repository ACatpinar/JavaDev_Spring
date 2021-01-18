package com.services;

import com.interfaces.Course;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component
public class Selenium implements Course {
    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching Hours : 17");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Post Construct Method is executing");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("Pre Destroy method is executing");
    }
}
