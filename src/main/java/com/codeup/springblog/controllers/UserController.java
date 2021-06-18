package com.codeup.springblog.controllers;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//@Controller
//public class UserController {
//
//    @GetMapping("users/all")
//    public String getAllUsers(){
//        return "users";
//    }
//
//    @GetMapping("/user")
//    @ResponseBody
//    public String getTheStringUser(){
//        return "users";
//    }
//}


import com.codeup.springblog.models.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.codeup.springblog.DAOs.UserRepository;

@Controller
public class UserController {

    private UserRepository users;
    private PasswordEncoder passwordEncoder;


    public UserController(UserRepository users, PasswordEncoder passwordEncoder) {
        this.users = users;
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping("/sign-up")
    public String showSignupForm(Model model) {
        model.addAttribute("user", new User());
        return "users/sign-up";
    }

    @PostMapping("/sign-up")
    public String saveUser(@ModelAttribute User user) {
        String hash = passwordEncoder.encode(user.getPassword());
        user.setPassword(hash);
        users.save(user);
        return "redirect:/login";
    }
}




