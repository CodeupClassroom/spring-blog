package com.blog.blog.controllers;

import com.blog.blog.models.Post;
import com.blog.blog.models.User;
import com.blog.blog.repositories.PostsRepo;
import com.blog.blog.repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/your-posts")
    @ResponseBody
    public String findUser(){

        User user = userRepository.findOne(2L);
        List<Post> posts = user.getPosts();

        for (Post post :posts) {
            System.out.println("post.getId() = " + post.getId());
        }

        return "your-posts";

    }

}
