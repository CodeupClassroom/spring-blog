package com.blog.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

//    method	url	description
//    GET	/posts	posts index page
//    GET	/posts/{id}	view an individual post
//    GET	/posts/create	view the form for creating a post
//    POST	/posts/create	create a new post

    @GetMapping("/posts")
    @ResponseBody
    public String index() {
        return "Showing all posts";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String show(@PathVariable long id) {
        return "Showing post with id of " + id;
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
