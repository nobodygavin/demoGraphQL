package com.ze.graphql.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ze.graphql.example.demo.bean.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {

  List<Review> findByBookId(Long bookId);
}
