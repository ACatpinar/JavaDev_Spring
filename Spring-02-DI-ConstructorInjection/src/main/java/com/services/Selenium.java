package com.services;

import com.Interfaces.Course;
import com.Interfaces.ExtraSessions;

public class Selenium implements Course {
  //  OfficeHours officeHours;
    ExtraSessions extraSessions;

    public Selenium(OfficeHours officeHours) {
        this.extraSessions = officeHours;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours : "+(15 +extraSessions.getHours()));
    }
}
