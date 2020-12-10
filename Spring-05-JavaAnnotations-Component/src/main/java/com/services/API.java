package com.Services;

import com.Interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class API implements Course {

    @Override
    public void getTeachingHours() {
        System.out.println("WeeklyTeachingHours: 17");
    }
}
