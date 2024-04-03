package com.fitnesstrackingapplication.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomePageMvcController {
    @GetMapping
    public String showHomePage (Model model, HttpSession session){
        return "index";
    }
}
