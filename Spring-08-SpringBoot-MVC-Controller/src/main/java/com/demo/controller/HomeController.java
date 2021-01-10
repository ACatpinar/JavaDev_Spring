package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String getRequestMapping(){
        return "home";

    }
    @RequestMapping(method = RequestMethod.GET,value = "/nel")
    public String getRequestMapping2(){
        return "home";

    }
    @RequestMapping(method = RequestMethod.POST,value = "/nel")
    public String getRequestMapping3(){
        return "home";

    }
    @GetMapping("/spring")
    public String getMappingEx(){
        return "home";
    }
    @PostMapping("/spring")
    public String getMappingEx2(){
        return "home";
    }
}

//Send your request to front controller
// F.C -> @Controller -> Method with the request parameter