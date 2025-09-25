package com.crudapp.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String viewIndexPage(Model model){

        List<User> listUsers = userService.listAllUsers();

        model.addAttribute("listUsers", listUsers);
        model.addAttribute("pageTitle", "Manage Users");

        return "/user/users";
    }
}
