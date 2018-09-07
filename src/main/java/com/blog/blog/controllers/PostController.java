package com.blog.blog.controllers;

import com.blog.blog.Post;
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

    List<Post> posts = new ArrayList<>();

//    method	url	description
//    GET	/posts	posts index page
//    GET	/posts/{id}	view an individual post
//    GET	/posts/create	view the form for creating a post
//    POST	/posts/create	create a new post

    public PostController(){

        posts.add(new Post("My family","Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ab aliquam corporis dignissimos dolore exercitationem impedit, iure non nulla optio saepe sint soluta tenetur velit vero, voluptatem! Animi dignissimos eveniet incidunt?"));
        posts.add(new Post("My feelings","Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ab aliquam corporis dignissimos non nulla optio saepe sint soluta tenetur velit vero, voluptatem! Animi dignissimos eveniet incidunt?"));
        posts.add(new Post("My house","Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ab aliquam corporis dignissimos dolore exercitationem "));

    }

    @GetMapping("/posts")
    public String index(Model viewModel) {

        viewModel.addAttribute("posts", posts);

        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String show(@PathVariable long id, Model viewModel) {
        Post post = posts.get( (int) id - 1);
        viewModel.addAttribute("post", post);
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
