package com.Services;

import com.Interfaces.ExtraSessions;
import org.springframework.stereotype.Component;

@Component
public class MockInterviews implements ExtraSessions {
    @Override
    public int getHours() {
        return 9;
    }
}
