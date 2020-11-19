package com.services;

import com.Interfaces.ExtraSessions;

public class OfficeHours implements ExtraSessions{

    @Override
    public int getHours() {
        return 5;
    }
}
