package com.blog.blog.controllers;

import com.blog.blog.models.Post;
import com.blog.blog.repositories.PostsRepo;
import com.blog.blog.services.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    PostsRepo postsRepo;

    public PostController(PostsRepo postsRepo) {
        this.postsRepo = postsRepo;
    }

    @GetMapping("/posts")
    public String index(Model viewModel) {
        viewModel.addAttribute("posts", postsRepo.findAll());
        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String show(@PathVariable long id, Model viewModel) {
        viewModel.addAttribute("post", postsRepo.findOne(id));
        return "posts/show";
    }

    @GetMapping("/posts/create")
    public String postCreateForm(Model model) {
        model.addAttribute("post", new Post());
        return "posts/create";
    }

    @PostMapping("/posts/create")
    public String insertPost(@ModelAttribute Post post) {
        postsRepo.save(post);
        return "redirect:/posts";
    }

    @GetMapping("/posts/{id}/edit")
    public String postEditForm(@PathVariable long id, Model model) {
        model.addAttribute("post", postsRepo.findOne(id));
        return "posts/edit";
    }

    @PostMapping("/posts/{id}/edit")
    public String updatePost(@ModelAttribute Post post) {
        postsRepo.save(post);
        return "redirect:/posts";
    }

    @PostMapping("/posts/delete")
    public String deletePost(@RequestParam(name = "id") long id){
        postsRepo.delete(id);
        return "redirect:/posts";
    }

}
