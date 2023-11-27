// CommentServiceImpl.java
package com.fatecbs.blog.service.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatecbs.blog.model.Comment;
import com.fatecbs.blog.repository.CommentRepository;
import com.fatecbs.blog.service.CommentService;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Override
    public List<Comment> getCommentsByPostId(Long postId) {
        return commentRepository.findByPostId(postId);
    }

    @Override
    public Comment createComment(Comment comment) {
        comment.setCommentedDate(LocalDateTime.now());
        return commentRepository.save(comment);
    }

    @Override
    public void deleteComment(Long id) {
        commentRepository.deleteById(id);
    }
}
