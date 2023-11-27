// PostRepository.java
package com.fatecbs.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fatecbs.blog.model.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
}
