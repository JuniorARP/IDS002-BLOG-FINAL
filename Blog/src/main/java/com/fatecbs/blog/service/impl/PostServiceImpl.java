// PostServiceImpl.java
package com.fatecbs.blog.service.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatecbs.blog.model.Post;
import com.fatecbs.blog.repository.PostRepository;
import com.fatecbs.blog.service.PostService;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;

    @Override
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    @Override
    public Post getPostById(Long id) {
        return postRepository.findById(id).orElse(null);
    }

    @Override
    public Post createPost(Post post) {
        post.setCreatedDate(LocalDateTime.now());
        return postRepository.save(post);
    }

    @Override
    public void deletePost(Long id) {
        postRepository.deleteById(id);
    }

    @Override
    public Post updatePost(Long id, Post updatedPost) {
        Post existingPost = postRepository.findById(id).orElse(null);
        if (existingPost != null) {
            existingPost.setTitle(updatedPost.getTitle());
            existingPost.setContent(updatedPost.getContent());
            existingPost.setHashtags(updatedPost.getHashtags());
            return postRepository.save(existingPost);
        }
        return null;
    }

    @Override
    public Post hidePost(Long id) {
        Post existingPost = postRepository.findById(id).orElse(null);
        if (existingPost != null) {
            existingPost.setInative(1);
            return postRepository.save(existingPost);
        }
        return null;
    }
}
