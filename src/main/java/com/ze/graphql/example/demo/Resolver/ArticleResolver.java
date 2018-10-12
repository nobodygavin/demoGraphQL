package com.ze.graphql.example.demo.Resolver;

import java.util.List;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;

import com.ze.graphql.example.demo.bean.Article;
import com.ze.graphql.example.demo.bean.Comment;
import com.ze.graphql.example.demo.bean.Profile;
import com.ze.graphql.example.demo.repository.CommentRepository;
import com.ze.graphql.example.demo.repository.ProfileRepository;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class ArticleResolver implements GraphQLResolver<Article> {
  private CommentRepository commentRepository;
  private ProfileRepository profileRepository;

  public Profile getAuthor(final Article article) {
    return profileRepository.getOne(article.getAuthorId());
  }

  public List<Comment> getComments(final Article article) {
    return commentRepository.findByArticleId(article.getId());
  }
}
