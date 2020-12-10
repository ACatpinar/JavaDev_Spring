package com.Services;

import com.Interfaces.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Selenium implements Course {

    private OfficeHours officeHours;
    @Autowired
    public Selenium(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }

    public void getTeachingHours() {

        System.out.println("WeeklyTeachingHours: "+(15 +officeHours.getHours()));
    }
}
