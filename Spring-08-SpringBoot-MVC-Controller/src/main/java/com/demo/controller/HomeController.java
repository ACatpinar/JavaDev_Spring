package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/home")
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
    @GetMapping("home/{name}")
    public String pathVariable(@PathVariable("name")String name){
        return "home";
    }
    @GetMapping("home/{name}/{email}")
    public String pathVariable2(@PathVariable("name")String name,@PathVariable("email")String email){
        System.out.println("name is:"+ name);
        System.out.println("email is:"+ email);
        return "home";
    }

    @GetMapping("home/course")
    public String requestParamEx(@RequestParam("course")String course){
        System.out.println("Course is "+ course);
        return "home";
    }
    @GetMapping(value="home/course2")
    public String requestParamEx2(@RequestParam(value="name", required = false, defaultValue = "Cybertek")String name){
        System.out.println("Name is "+ name);
        return "home";
    }

}

//Send your request to front controller
// F.C -> @Controller -> Method with the request parameter