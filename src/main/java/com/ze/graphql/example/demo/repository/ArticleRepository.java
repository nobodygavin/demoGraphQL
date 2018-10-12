package com.ze.graphql.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ze.graphql.example.demo.bean.Article;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
