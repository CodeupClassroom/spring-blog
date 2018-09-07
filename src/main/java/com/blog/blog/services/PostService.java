package com.blog.blog.services;

import com.blog.blog.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    List<Post> posts = new ArrayList<>();

    public PostService() {
        createStarterPosts();
    }

    public Post findOne(long id) {
        return posts.get((int) id - 1);
    }

    public List<Post> findAll() {
        return posts;
    }

    private void createStarterPosts() {
        posts.add(new Post("My family","Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ab aliquam corporis dignissimos dolore exercitationem impedit, iure non nulla optio saepe sint soluta tenetur velit vero, voluptatem! Animi dignissimos eveniet incidunt?"));
        posts.add(new Post("My feelings","Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ab aliquam corporis dignissimos non nulla optio saepe sint soluta tenetur velit vero, voluptatem! Animi dignissimos eveniet incidunt?"));
        posts.add(new Post("My house","Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ab aliquam corporis dignissimos dolore exercitationem "));

    }


}
