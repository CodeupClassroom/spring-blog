package com.blog.blog.controllers;

import com.blog.blog.Post;
import com.blog.blog.services.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController {

    private final PostService postSvc;

    public PostController(PostService postSvc) {
        this.postSvc = postSvc;
    }

    @GetMapping("/posts")
    public String index(Model viewModel) {
        viewModel.addAttribute("posts", postSvc.findAll());
        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String show(@PathVariable long id, Model viewModel) {
        viewModel.addAttribute("post", postSvc.findOne(id));
        return "posts/show";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String show() {
        return "Showing form to create new post!";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String create() {
        return "New post was created!";
    }

}
