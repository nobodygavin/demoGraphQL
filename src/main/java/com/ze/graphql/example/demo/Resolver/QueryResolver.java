package com.ze.graphql.example.demo.Resolver;

import java.util.List;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import com.ze.graphql.example.demo.bean.Book;
import com.ze.graphql.example.demo.bean.Author;
import com.ze.graphql.example.demo.bean.Review;
import com.ze.graphql.example.demo.repository.AuthorRepository;
import com.ze.graphql.example.demo.repository.BookRepository;
import com.ze.graphql.example.demo.repository.ReviewRepository;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class QueryResolver implements GraphQLQueryResolver {
  private BookRepository bookRepository;
  private ReviewRepository reviewRepository;
  private AuthorRepository authorRepository;

  public List<Book> getBooks() {
    return bookRepository.findAll();
  }

  public List<Review> getReviews() {
    return reviewRepository.findAll();
  }

  public List<Author> getAuthors() {
    return authorRepository.findAll();
  }

  public Author getAuthor(final Long id) {
    return authorRepository.getOne(id);
  }

  public Book getBook(final Long id) {
    return bookRepository.getOne(id);
  }
}
