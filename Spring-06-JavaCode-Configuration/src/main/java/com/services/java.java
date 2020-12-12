package com.services;

import com.interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class java implements Course {

    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours 30 ");
    }
}
