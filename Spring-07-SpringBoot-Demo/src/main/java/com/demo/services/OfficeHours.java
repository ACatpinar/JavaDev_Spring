package com.demo.services;

import com.demo.interfaces.ExtraSessions;
import org.springframework.stereotype.Component;

@Component
public class OfficeHours implements ExtraSessions {
    @Override
    public int extraSessions() {
        return 5;
    }
}
