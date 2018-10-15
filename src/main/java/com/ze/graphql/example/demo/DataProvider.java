package com.ze.graphql.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.ze.graphql.example.demo.bean.Book;
import com.ze.graphql.example.demo.bean.Author;
import com.ze.graphql.example.demo.bean.Review;
import com.ze.graphql.example.demo.repository.AuthorRepository;
import com.ze.graphql.example.demo.repository.BookRepository;
import com.ze.graphql.example.demo.repository.ReviewRepository;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class DataProvider implements CommandLineRunner {
  private ReviewRepository reviewRepository;
  private BookRepository bookRepository;
  private AuthorRepository authorRepository;

  @Override
  @Transactional
  public void run(String... strings) {
    Author author1 = authorRepository.save(new Author(null, "Eric Carle", "Eric Carle is acclaimed and beloved as the creator of brilliantly illustrated and innovatively designed picture books for very young children."));
    Author author2 = authorRepository.save(new Author(null, "Bill Martin Jr.", "An elementary-school principal, teacher, writer, and poet, held a doctoral degree in early childhood education. "));

    Book book1 = bookRepository.save(new Book(null, "The Very Hungry Caterpillar", author1.getId()));
    Book book2 = bookRepository.save(new Book(null, "Brown Bear, Brown Bear, What Do You See?", author2.getId()));
    Book book3 = bookRepository.save(new Book(null, "10 Little Rubber Ducks Board Book", author1.getId()));

    reviewRepository.save(new Review(null, "Simply beautiful!", book1.getId()));
    reviewRepository.save(new Review(null, "Cute Book but Seems to Be Written for Younger Children", book1.getId()));
    reviewRepository.save(new Review(null, "This is one of our favorite books. We have printed out pictures of each ...", book2.getId()));
    reviewRepository.save(new Review(null, "The sequel is not always better", book2.getId()));
    reviewRepository.save(new Review(null, "stars6 month olds favorite book", book2.getId()));
    reviewRepository.save(new Review(null, "but what I have read I enjoyed. I can remember reading this book to my ...", book2.getId()));
    reviewRepository.save(new Review(null, "Great book for young infants!", book2.getId()));
    reviewRepository.save(new Review(null, "Cannot go wrong with a classic author and illustrator like Eric Carle", book3.getId()));
    reviewRepository.save(new Review(null, "A great addition to our library!", book3.getId()));
    reviewRepository.save(new Review(null, "Meet Lots of New Animals on this Book Adventure", book3.getId()));
  }
}
