package com.crudapp.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/")
    public String viewIndexPage(Model model){

        model.addAttribute("pageTitle", "Manage Users");

        return "/index";
    }
}
