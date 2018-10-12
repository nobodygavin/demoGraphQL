package com.ze.graphql.example.demo.Resolver;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;

import com.ze.graphql.example.demo.bean.Comment;
import com.ze.graphql.example.demo.bean.Profile;
import com.ze.graphql.example.demo.repository.ProfileRepository;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class CommentResolver implements GraphQLResolver<Comment> {
  private ProfileRepository profileRepository;

  public Profile getAuthor(final Comment comment) {
    return profileRepository.getOne(comment.getAuthorId());
  }
}
