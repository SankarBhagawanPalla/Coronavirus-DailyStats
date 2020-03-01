package com.javaworks.coronavirusstats.controllers;

import com.javaworks.coronavirusstats.services.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    DataService dataService;

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("stats", dataService.getAllStats());
        return "home";
    }

}
