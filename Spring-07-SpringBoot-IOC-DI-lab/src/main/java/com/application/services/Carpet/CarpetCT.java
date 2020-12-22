package com.application.services.Carpet;

import com.application.Interfaces.carpetPrices.Carpet;
import enums.City;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Component
public class CarpetCT implements Carpet {

    private static final Map<City,BigDecimal> sqPriceForCity = new HashMap<>();

        static {
            sqPriceForCity.put(City.CAPETOWN,new BigDecimal("1.32"));
            sqPriceForCity.put(City.MCLEAN,new BigDecimal("3.52"));
            sqPriceForCity.put(City.CAPETOWN,new BigDecimal("6.05"));
        }



        @Override
        public BigDecimal getSqFPrice(City city) {

            BigDecimal defaultValue = BigDecimal.ZERO;

            Optional<Map.Entry<City, BigDecimal>> collect = sqPriceForCity.entrySet().stream().filter(x -> x.getKey()==city).findFirst(); //entry set converts set or list to map


            return collect.isPresent() ? collect.get().getValue() : defaultValue;
        }
    }

