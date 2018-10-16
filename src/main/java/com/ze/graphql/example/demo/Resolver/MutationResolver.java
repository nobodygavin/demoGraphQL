package com.ze.graphql.example.demo.Resolver;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

import com.ze.graphql.example.demo.bean.AddReviewInput;
import com.ze.graphql.example.demo.bean.Review;
import com.ze.graphql.example.demo.repository.ReviewRepository;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class MutationResolver implements GraphQLMutationResolver {
  private final ReviewRepository reviewRepository;

  @Transactional
  public Review addReview(final AddReviewInput input) {
    return reviewRepository.saveAndFlush(new Review(null, input.getComment(), input.getBookId()));
  }

  @Transactional
  public Long deleteReview(final Long id) {
    reviewRepository.deleteById(id);
    return id;
  }
}
