package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class PersonController {
    @GetMapping("/hello")
    public String hello(Model model) {
// Creating a Person object and adding it to the model
        Person person = new Person();
        person.setFirstName("Harrison");
        person.setLastName("Lawrence");
        model.addAttribute("person", person);
// Returning the name of the Thymeleaf template to be
// rendered
        return "output";
    }
}

