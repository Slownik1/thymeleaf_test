package com.example.thymeleaf_test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    CarModel ferrari = new CarModel("411", "Ferrari");

    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("name", ferrari);
        return "hello";
    }

}
