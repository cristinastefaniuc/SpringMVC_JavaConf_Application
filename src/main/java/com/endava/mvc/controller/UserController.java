package com.endava.mvc.controller;

import com.endava.mvc.model.User;
import com.endava.mvc.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RequiredArgsConstructor
@Controller
@RequestMapping(value = "/")
public class UserController {

    //private final UserService userService;

    @RequestMapping(value = {"/", "/home"}, method = GET)
    public String showHomePage(@ModelAttribute("user") User user) {
        return "home";
    }

    @RequestMapping(value = "/home", method = POST)
    public String takeValues(@ModelAttribute("user") User user) {
        UserService.addUser(user);
        return "redirect:/show-users";
    }

    @RequestMapping(value = "/show-users", method = GET)
    public String showUsers(Model model) {
        model.addAttribute("userList", UserService.getAllUsers());
        return "users";
    }
}
