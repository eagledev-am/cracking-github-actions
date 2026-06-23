package com.eagledev.controller;

import com.eagledev.services.GoatService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    private final GoatService goatService;

    public Controller(GoatService goatService) {
        this.goatService = goatService;
    }

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @RequestMapping("/goat")
    public String getGoat(@RequestParam("goat") String player) {
        return "Goat: " + goatService.getGoat(player);
    }
}
