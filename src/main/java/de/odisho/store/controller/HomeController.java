package de.odisho.store.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String index() {
        return "Welcome to Homepage!";
    }

    @RequestMapping("/about")
    public String about() {
        return "Hi there, I'm alen2go!";
    }
}
