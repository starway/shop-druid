package com.xcky.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xcky.entity.User;

public interface UserRepository extends JpaRepository<User, String>{

}
