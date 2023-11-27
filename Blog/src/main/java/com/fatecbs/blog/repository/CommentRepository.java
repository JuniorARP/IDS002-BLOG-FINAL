// CommentRepository.java
package com.fatecbs.blog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fatecbs.blog.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPostId(Long postId);
}
