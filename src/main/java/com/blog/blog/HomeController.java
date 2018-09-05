package com.blog.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String returnHomePage() {
        return "This is the landing page!";
    }

}
