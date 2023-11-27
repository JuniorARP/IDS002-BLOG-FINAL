package com.fatecbs.blog.service;

import com.fatecbs.blog.model.Post;

import java.util.List;

public interface PostService {
    List<Post> getAllPosts();
    Post getPostById(Long id);
    Post createPost(Post post);
    void deletePost(Long id);
    Post updatePost(Long id, Post updatedPost);
    Post hidePost(Long id);
}
