package com.demo.services;

import com.demo.interfaces.Course;
import com.demo.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class java implements Course {


    private ExtraSessions extraSessions;
    @Value("${instructor}")
    private String instructorName;

    public java(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }



    @Override
    public int teachingHours() {
        return 20+ extraSessions.extraSessions();
    }
}
