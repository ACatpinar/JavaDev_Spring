package com.Services;

import com.Interfaces.Course;
import com.Interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component

public class Selenium implements Course {


    @Value("JD1")
    private String batch;
    @Value("${instructor}")
    private String instructor;
    @Value("${days}")
    private String [] days;

    @Override
    public String toString() {
        return "Selenium{" +
                "batch='" + batch + '\'' +
                ", instructor='" + instructor + '\'' +
                ", days=" + Arrays.toString(days) +
                '}';
    }
    private ExtraSessions extraSessions;
    public void getTeachingHours() {

        System.out.println("WeeklyTeachingHours: " +(15 +extraSessions.getHours()));
    }
}
