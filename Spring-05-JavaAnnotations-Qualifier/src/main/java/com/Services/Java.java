package com.Services;

import com.Interfaces.Course;
import com.Interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {


     @Autowired
     @Qualifier("officeHours")
     private  ExtraSessions extraSessions;

    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours: " +(20 +extraSessions.getHours()));
    }
}
