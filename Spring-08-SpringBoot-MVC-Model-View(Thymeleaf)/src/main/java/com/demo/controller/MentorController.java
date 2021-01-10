package com.demo.controller;

import com.demo.enums.Gender;
import com.demo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/mentor")
public class MentorController {

    @GetMapping("/list")
    public String showTable(Model model){

        List<Mentor> mentorList = new ArrayList<>();

        mentorList.add(new Mentor("Mike","Smith",24, Gender.MALE));
        mentorList.add(new Mentor("Micky","Samson",45, Gender.MALE));
        mentorList.add(new Mentor("Michelle","Simpson",27, Gender.FEMALE));
        mentorList.add(new Mentor("Mikhail","Samskov",43, Gender.MALE));
        mentorList.add(new Mentor("Maria","Serskiny",34, Gender.FEMALE));

        model.addAttribute("mentors",mentorList);
        return "mentor/mentor-list";
    }
}
