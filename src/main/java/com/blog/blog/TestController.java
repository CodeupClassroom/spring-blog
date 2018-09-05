package com.blog.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class TestController {

    @RequestMapping(path = "/hi", method = RequestMethod.GET)
    @ResponseBody
    private String sayHi() {
        return "Well, hi!";
    }

    @RequestMapping("/texas/howdy")
    @ResponseBody
    private String sayHowdy() {
        return "Howdy!";
    }

    @GetMapping("/greetings")
    @ResponseBody
    private String greet() {
        return "Greetings";
    }

    // extracting URI path variables
    @RequestMapping("/name/{name}")
    @ResponseBody
    private String sayName(@PathVariable String name) {
        return "Your name is: " + name;
    }

    @GetMapping("/favnum/{favnum}/leastfavnum/{leastnum}")
    @ResponseBody
    private String numMessage(
            @PathVariable int leastnum,
            @PathVariable int favnum
            ) {
        String message = "";
        message += "Fav num is: " + favnum;
        message += "<br>";
        message += "Least fav num is: " + leastnum;
        return message;
    }




}
