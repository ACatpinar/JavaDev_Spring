package com.application.calculator;

import com.application.Interfaces.FloorTypes.Floor;
import com.application.Interfaces.carpetPrices.Carpet;
import enums.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class Calculator {

    @Qualifier("carpetPA")
    @Autowired
    private Carpet carpet;

    @Qualifier("kitchen")
    @Autowired
    private Floor floor;

    public String getTotalCarpetCost(City city) throws Exception {

        BigDecimal cost = carpet.getSqFPrice(city).multiply(floor.getArea());

        if (cost.compareTo(BigDecimal.ZERO)==0){
            throw new Exception("This city does not exist");
        }

        return "Total Cost for carpet: "+ cost;

    }
}
