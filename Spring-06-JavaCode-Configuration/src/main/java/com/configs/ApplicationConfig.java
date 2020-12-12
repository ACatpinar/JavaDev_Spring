package com.configs;

import com.interfaces.ExtraSessions;
import com.services.Java;
import com.services.OfficeHours;
import com.services.Selenium;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan("com")
@PropertySource("classpath:application.properties")
public class ApplicationConfig {

    @Bean   // can be applied at method level
    public Java java(){
        return new Java(extraSessions());      // returning java object   // we created constructor in java class, returning extra sessions that's why we need to give the argumnt that implies  extra session which is officehours
    }
    @Bean
    public Selenium selenium (){
        return new Selenium(extraSessions());
    }

    /*
    @Bean
    public OfficeHours officeHours(){
        return new OfficeHours() ;
     }
     */

    @Bean
    public ExtraSessions extraSessions(){
        return  new OfficeHours();
    }



}
