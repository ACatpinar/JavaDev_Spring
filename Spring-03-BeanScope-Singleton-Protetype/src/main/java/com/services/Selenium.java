package com.services;

import com.Interfaces.Course;

public class Selenium implements Course {


    @Override
    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours : "+15);
    }
}
