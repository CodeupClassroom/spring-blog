package com.blog.blog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {

    @GetMapping("/hello/{name}")
    public String returnHomePage(@PathVariable String name, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("fer", "fer");
        return "home";
    }

}
