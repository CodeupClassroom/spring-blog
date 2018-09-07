package com.blog.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MathController {

//            url	response
//            /add/3/and/4	7
//            /subtract/3/from/10	7
//            /multiply/4/and/5	20
//            /divide/6/by/3	2

    @GetMapping("/add/{num1}/and/{num2}")
    @ResponseBody
    public int add(@PathVariable int num1, @PathVariable int num2) {
        return num1 + num2;
    }

    @GetMapping("/subtract/{num1}/from/{num2}")
    @ResponseBody
    public int subtract(@PathVariable int num1, @PathVariable int num2) {
        return num2 - num1;
    }

    @GetMapping("/multiply/{num1}/and/{num2}")
    @ResponseBody
    public int multiply(@PathVariable int num1, @PathVariable int num2) {
        return num1 * num2;
    }

    @GetMapping("/divide/{num1}/by/{num2}")
    @ResponseBody
    public int divide(@PathVariable int num1, @PathVariable int num2) {
        return num1 / num2;
    }

}
