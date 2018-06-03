package com.stock.stocktracing.domain.repository;

import com.stock.stocktracing.domain.entity.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {
}
