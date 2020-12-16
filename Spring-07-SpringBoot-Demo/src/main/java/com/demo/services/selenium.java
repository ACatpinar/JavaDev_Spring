package com.demo.services;

import com.demo.interfaces.Course;
import com.demo.interfaces.ExtraSessions;
import org.springframework.stereotype.Component;

@Component
public class selenium implements Course {

    private ExtraSessions extraSessions ;

    public selenium(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    @Override
    public int teachingHours() {
        return 13 +extraSessions.extraSessions();
    }
}
