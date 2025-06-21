package com.example.blogging_platform.services;

import com.example.blogging_platform.repository.BlogRepository;
import org.springframework.stereotype.Service;

@Service
public class BlogService {

    private final BlogRepository blogRepository;

    public BlogService(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    public void createBlog(){

    }
}
