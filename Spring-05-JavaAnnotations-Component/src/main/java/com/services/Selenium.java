package com.Services;

import com.Interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class Selenium implements Course {
    public void getTeachingHours() {
        System.out.println("WeeklyTeachingHours: 15");
    }
}
