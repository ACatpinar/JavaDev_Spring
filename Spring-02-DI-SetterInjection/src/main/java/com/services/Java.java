package com.services;

import com.Interfaces.Course;
import com.Interfaces.ExtraSessions;



public class Java implements Course {

  private officeHours officeHours;

    public officeHours getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(officeHours officeHours) { // set +officeHours
        this.officeHours = officeHours;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours: "  +(20 +officeHours.getHours())); //
    }
}
