package com.crudapp.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public String listUsers(Model model){

        List<User> listUsers = userService.listAllUsers();

        model.addAttribute("listUsers", listUsers);
        model.addAttribute("pageTitle", "Manage Users");

        return "/user/users";
    }

    @GetMapping("/user/create")
    public String createUser(Model model){

        User user = new User();

        model.addAttribute("user", user);
        model.addAttribute("pageTitle", "Add New User");

        return "/user/user_form";
    }

    @PostMapping("/user/save")
    public String saveUser(User user, RedirectAttributes redirectAttributes){

        userService.save(user);

        redirectAttributes.addFlashAttribute("message", "User is added successfully!");

        return "redirect:/users";
    }

    @GetMapping("/user/edit/{userId}")
    public String editUser(@PathVariable(name = "userId") int userId, Model model, RedirectAttributes redirectAttributes){

        try {

            User user = userService.get(userId);

            model.addAttribute("user", user);
            model.addAttribute("pageTitle", "Edit User With The ID: " + userId);

            return "/user/user_form";

        }catch (UserNotFoundException exception){

            redirectAttributes.addFlashAttribute("message", exception.getMessage());

            return "redirect:/users";
        }
    }
}
