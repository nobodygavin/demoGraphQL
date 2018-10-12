package com.ze.graphql.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ze.graphql.example.demo.bean.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
  @SuppressWarnings({"rawtypes", "SpringDataRepositoryMethodReturnTypeInspection"})
  List findByArticleId(Long articleId);
}
