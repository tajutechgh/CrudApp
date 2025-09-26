package com.crudapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    @GetMapping("/")
    public String viewDashboard(){

        return "redirect:/users";
    }
}
