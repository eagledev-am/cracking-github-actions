package com.eagledev.services;

import org.springframework.stereotype.Service;

@Service
public class GoatService {
    public String getGoat(String player) {
        if (player.equalsIgnoreCase("Ronaldo")) {
            return "Ronaldo is the GOAT";
        } else if (player.equalsIgnoreCase("Messi")) {
            return "Messi is the GOAT";
        } else {
            return "Aboutrika is the GOAT";
        }
    }
}
