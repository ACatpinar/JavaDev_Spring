package com.Services;

import com.Interfaces.Course;
import com.Interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Selenium implements Course {

   // @Autowired
    //@Qualifier("mockInterviews")

    public Selenium(@Qualifier("mockInterviews") ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    private ExtraSessions extraSessions ;

    public void getTeachingHours() {

        System.out.println("WeeklyTeachingHours: " +(15 +extraSessions.getHours()));
    }
}
