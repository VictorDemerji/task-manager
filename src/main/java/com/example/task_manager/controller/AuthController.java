package com.example.task_manager.controller;

import com.example.task_manager.model.User;
import com.example.task_manager.service.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthController {

    private final UserService service;

    public AuthController(UserService service) {
        this.service = service;
    }

    @GetMapping("/login")
    public String loginPage(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }

    @PostMapping("/login")
    public String login(User user, HttpSession session, Model model) {

        User logged = service.login(user.getUsername(), user.getPassword());

        if (logged == null) {
            model.addAttribute("error", "Invalid username or password");
            return "login";
        }

        session.setAttribute("user", logged);
        return "redirect:/";
    }
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }
}
