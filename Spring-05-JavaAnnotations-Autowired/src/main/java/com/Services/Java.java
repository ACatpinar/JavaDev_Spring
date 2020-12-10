package com.Services;

import com.Interfaces.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

    /*
    @Autowired
    public void setOfficeHours(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }

     */
    @Autowired
    private OfficeHours officeHours;
/*
    @Autowired
    public Java(OfficeHours officeHours) {


 */


    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours: "+(30 +officeHours.getHours()));
    }
}
