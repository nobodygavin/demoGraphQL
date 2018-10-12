package com.ze.graphql.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ze.graphql.example.demo.bean.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Long> {

}
