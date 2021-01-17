package com.practice.controller;

import com.practice.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @GetMapping
    public String showUser(Model model){

        model.addAttribute("user", new User());

        List<String> stateList = Arrays.asList("PA","VA","MD","TN","KN","IL","DC","TX","NY");
        model.addAttribute("stateList",stateList);

        return "/user/user-register";
    }

    @PostMapping("/confirm")
    public String submit(@ModelAttribute("user") User user){
        System.out.println(user.toString());

        return "user/user-confirmation";
    }


}
