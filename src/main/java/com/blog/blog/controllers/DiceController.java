package com.blog.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Random;

@Controller
public class DiceController {

    @GetMapping("/roll-dice")
    public String returnRollDice() {
        return "roll-dice";
    }

    @GetMapping("/roll-dice/{num}")
    public String returnResults(@PathVariable int num, Model model) {
        model.addAttribute("answer", generateRandomNum());
        model.addAttribute("userGuess", num);
        return "roll-results";
    }

    private int generateRandomNum() {
        Random random = new Random();
        return random.nextInt((6 - 1) + 1) + 1;
    }


}
