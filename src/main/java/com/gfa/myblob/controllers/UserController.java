package com.gfa.myblob.controllers;

import com.gfa.myblob.models.User;
import com.gfa.myblob.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/showphotos")
    public String renderUser(Model model) {
        List<User> users = userService.getAllUsers();
        model.addAttribute("users", users);
        return "index";
    }

    @GetMapping("/showphotos/user/create")
    public String renderAddNewUser(){
        return "user-create";
    }

    @PostMapping("/showphotos/user/create")
    public String createNewUser(String name, Model model) {
        if (name.equals("")) {
            model.addAttribute("error", "Invalid user name. Please provide a valid name.");
            return "user-error";
        }
        userService.saveUser(new User(name));
        return "redirect:/showphotos";
    }

//editnél userId, create-nél nincs, mert db adja(autoinc.Id)
}
