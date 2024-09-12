package com.springLogin.SpringRestLogin.controller;

import com.springLogin.SpringRestLogin.model.User;
import com.springLogin.SpringRestLogin.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class Logincontroller {

    @Autowired
    private UserService userService;

    
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLoginPage() {
        return "login";
    }

    
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam String email, @RequestParam String pass, Model model) {
        User user = userService.findByEmailAndPassword(email, pass);
        if (user != null) {
            return "welcome";
        } else {
            model.addAttribute("error", "Invalid email or password!");
            return "login";
        }
    }

    
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String showRegistrationPage() {
        return "register";
    }

    
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String registerUser(@RequestParam String name, @RequestParam String email,
                               @RequestParam String city, @RequestParam String mobile,
                               @RequestParam String pass, @RequestParam String confirmPass, Model model) {

        if (!pass.equals(confirmPass)) {
            model.addAttribute("error", "Passwords do not match!");
            return "register";
        }

        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setCity(city);
        user.setMobileNumber(mobile);
        user.setPassword(pass);

        userService.saveUser(user);
        model.addAttribute("success", "Registration successful");
        return "register";
    }

    
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout() {
        return "redirect:/login";
    }

    
    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String showWelcomePage() {
        return "welcome";
    }
}
