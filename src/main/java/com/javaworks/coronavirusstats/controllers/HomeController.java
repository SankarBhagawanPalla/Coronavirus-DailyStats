package com.javaworks.coronavirusstats.controllers;

import com.javaworks.coronavirusstats.models.LocationStat;
import com.javaworks.coronavirusstats.services.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    DataService dataService;

    @GetMapping("/")
    public String home(Model model){
        List<LocationStat> stats = dataService.getAllStats();
        int sum = stats.stream().mapToInt(stat -> stat.getLatestTotal()).sum();
        int totalchangesinceYesterday = stats.stream().mapToInt(stat -> stat.getChangefromYesterday()).sum();
        model.addAttribute("changetotal", totalchangesinceYesterday);
        model.addAttribute("stats", stats);
        model.addAttribute("total", sum);
        return "home";
    }

}
