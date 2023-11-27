package com.fatecbs.blog.service;

import com.fatecbs.blog.model.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> getCommentsByPostId(Long postId);
    Comment createComment(Comment comment);
    void deleteComment(Long id);
}
