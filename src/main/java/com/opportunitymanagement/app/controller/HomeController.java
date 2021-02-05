package com.opportunitymanagement.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public  String home(){
        return "index";
    }
    @RequestMapping(value = "/home")
    public  String home(Model model){
        return "/home";
    }
}
