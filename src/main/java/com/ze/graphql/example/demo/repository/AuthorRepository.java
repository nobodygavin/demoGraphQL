package com.ze.graphql.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ze.graphql.example.demo.bean.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
