package com.ze.graphql.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.ze.graphql.example.demo.bean.Article;
import com.ze.graphql.example.demo.bean.Comment;
import com.ze.graphql.example.demo.bean.Profile;
import com.ze.graphql.example.demo.repository.ArticleRepository;
import com.ze.graphql.example.demo.repository.CommentRepository;
import com.ze.graphql.example.demo.repository.ProfileRepository;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class DataProvider implements CommandLineRunner {
  private CommentRepository commentRepository;
  private ArticleRepository articleRepository;
  private ProfileRepository profileRepository;

  @Override
  @Transactional
  public void run(String... strings) {
    Profile author = profileRepository.save(new Profile(null, "g00glen00b", "The author of this blog"));
    Profile admin = profileRepository.save(new Profile(null, "admin", "The administrator of this blog"));
    Article article1 = articleRepository.save(new Article(null, "Hello wold", "This is a hello world", author.getId()));
    Article article2 = articleRepository.save(new Article(null, "Foo", "Bar", admin.getId()));
    commentRepository.save(new Comment(null, "Do you like this article?", article1.getId(), author.getId()));
    commentRepository.save(new Comment(null, "This is a great article", article1.getId(), admin.getId()));
    commentRepository.save(new Comment(null, "This is a comment", article2.getId(), admin.getId()));
  }
}
