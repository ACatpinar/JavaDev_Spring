package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main")
public class MainController {

    @RequestMapping("/new")
    public String getRequest(){
        return "new";

    }
    @GetMapping("/spring")
    public String getMapping(){
        return "new";
    }

    @GetMapping("new/{name}")
    public String pathVariable(@PathVariable("name")String name){
        System.out.println(name);
        return "new";
    }

}
