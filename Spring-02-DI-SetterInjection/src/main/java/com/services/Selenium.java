package com.services;

import com.Interfaces.Course;
import com.Interfaces.ExtraSessions;

public class Selenium implements Course {

    private officeHours officeHours;


    public officeHours getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(officeHours officeHours) {
        this.officeHours = officeHours;
    }



    @Override
    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours : "+(15 +officeHours.getHours()));
    }
}
