package com.services;

import com.Interfaces.Course;


public class Java implements Course {

    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours: "  +20);
    }

    public void getMyInitMethod(){
        System.out.println("Init Method executing");
    }
    public void DestroyMethod(){
        System.out.println("Destroy Method Executing");
    }

}
