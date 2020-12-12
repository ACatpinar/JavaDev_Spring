package com.services;

import com.interfaces.Course;
import com.interfaces.ExtraSessions;
import org.springframework.stereotype.Component;


public class Java implements Course {

    private ExtraSessions extraSessions;

    public Java(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours "+(30+extraSessions.getHours()));
    }
}
