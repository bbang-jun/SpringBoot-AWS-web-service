package com.bbangjun.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostsRepository extends JpaRepository<Posts, Long> { // 94p
    @Query("SELECT p FROM Posts p ORDER BY p.id DESC") // 147p
    List<Posts> findAllDesc();
}
