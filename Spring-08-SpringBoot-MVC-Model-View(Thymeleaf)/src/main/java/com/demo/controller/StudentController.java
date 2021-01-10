package com.demo.controller;

import com.demo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/welcome")
    public String homePage(Model model){

        model.addAttribute("name","Nelson"); //binding data to  model
        //attribute ====>    name         value

        model.addAttribute("course","Java");

        String subject = "collections";
        model.addAttribute("subject",subject);

        //create some random student id and show it your in your UI

        int studentID = new Random().nextInt(1000);
        model.addAttribute("ID",studentID);

        List<Integer> numbers = new ArrayList<>();

        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        model.addAttribute("numbers",numbers);

        // print your birthday
        LocalDate birthday = LocalDate.now().minusYears(27);
        model.addAttribute("birthday",birthday);

        Student student = new Student(1,"Mike","Smith");
        model.addAttribute("student",student);

        return"student/welcome";
    }

    @GetMapping("/register")
    public String homePage2(){
        return "student/register";
    }
}
