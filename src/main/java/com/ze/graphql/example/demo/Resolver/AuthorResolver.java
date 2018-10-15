package com.ze.graphql.example.demo.Resolver;

import java.util.List;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;

import com.ze.graphql.example.demo.bean.Author;
import com.ze.graphql.example.demo.bean.Book;
import com.ze.graphql.example.demo.repository.BookRepository;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class AuthorResolver implements GraphQLResolver<Author> {
  private BookRepository bookRepository;

  public List<Book> getBooks(final Author author) {
    return bookRepository.findByAuthorId(author.getId());
  }
}
