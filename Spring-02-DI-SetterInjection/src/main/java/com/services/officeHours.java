package com.services;

import com.Interfaces.ExtraSessions;

public class officeHours implements ExtraSessions{

    @Override
    public int getHours() {
        return 5;
    }
}
