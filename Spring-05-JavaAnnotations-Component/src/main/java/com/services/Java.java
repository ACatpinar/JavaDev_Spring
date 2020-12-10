package com.Services;

import com.Interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {
    public void getTeachingHours(){


            System.out.println("Weekly Teaching Hours: "  +20);
    }
}
