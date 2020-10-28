package com.app.visa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.visa.model.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {
    List<User> findByEmail(String email);
}
