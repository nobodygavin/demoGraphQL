package com.ze.graphql.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ze.graphql.example.demo.bean.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

  List<Book> findByAuthorId(Long authorId);
}
