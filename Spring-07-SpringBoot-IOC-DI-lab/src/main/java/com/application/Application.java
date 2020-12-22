package com.application;

import com.application.calculator.Calculator;
import enums.City;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws Exception {

		ApplicationContext container = SpringApplication.run(Application.class, args);

		Calculator calculator = container.getBean("calculator",Calculator.class);

		System.out.println(calculator.getTotalCarpetCost(City.BALACYNWYD));


	}

}
