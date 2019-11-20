package com.sovannarith.emoji.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    @GetMapping({"/", "/index"})
    public String main() {
        return "index"; //view
    }

}