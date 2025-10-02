package com.crudapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    @GetMapping("/")
    public String viewDashboard(Model model){

        model.addAttribute("pageTitle", "Dashboard");

        return "/dashboard";
    }
}
