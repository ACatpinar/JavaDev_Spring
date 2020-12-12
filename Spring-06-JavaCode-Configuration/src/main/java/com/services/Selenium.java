package com.services;

import com.interfaces.Course;
import com.interfaces.ExtraSessions;
import org.springframework.stereotype.Component;

@Component
public class Selenium implements Course {

    private ExtraSessions extraSessions;

    public Selenium(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours " +(25 +extraSessions.getHours()));
    }
}
