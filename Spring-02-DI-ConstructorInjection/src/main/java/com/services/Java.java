package com.services;

import com.Interfaces.Course;
import com.Interfaces.ExtraSessions;

public class Java implements Course {

   // OfficeHours officeHours;
    ExtraSessions extraSessions;

    public Java(OfficeHours officeHours) {
        this.extraSessions = officeHours;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours: "  +(20 +extraSessions.getHours())); //
    }
}
