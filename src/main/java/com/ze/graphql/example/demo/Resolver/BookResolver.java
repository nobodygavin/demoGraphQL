package com.ze.graphql.example.demo.Resolver;

import java.util.List;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;

import com.ze.graphql.example.demo.bean.Book;
import com.ze.graphql.example.demo.bean.Author;
import com.ze.graphql.example.demo.bean.Review;
import com.ze.graphql.example.demo.repository.AuthorRepository;
import com.ze.graphql.example.demo.repository.ReviewRepository;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class BookResolver implements GraphQLResolver<Book> {
  private final ReviewRepository reviewRepository;
  private final AuthorRepository authorRepository;

  public Author getAuthor(final Book book) {
    return authorRepository.getOne(book.getAuthorId());
  }

  public List<Review> getReviews(final Book book) {
    return reviewRepository.findByBookId(book.getId());
  }
}
