package com.ze.graphql.example.demo.Resolver;

import java.util.List;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import com.ze.graphql.example.demo.bean.Article;
import com.ze.graphql.example.demo.bean.Comment;
import com.ze.graphql.example.demo.bean.Profile;
import com.ze.graphql.example.demo.repository.ArticleRepository;
import com.ze.graphql.example.demo.repository.CommentRepository;
import com.ze.graphql.example.demo.repository.ProfileRepository;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class QueryResolver implements GraphQLQueryResolver {
  private ArticleRepository articleRepository;
  private CommentRepository commentRepository;
  private ProfileRepository profileRepository;

  public List<Article> getArticles() {
    return articleRepository.findAll();
  }

  public List<Comment> getComments() {
    return commentRepository.findAll();
  }

  public List<Profile> getProfiles() {
    return profileRepository.findAll();
  }

  public Article getArticle(final Long id) {
    return articleRepository.getOne(id);
  }
}
