package com.example.VisitorManagementSystem.repository;

import com.example.VisitorManagementSystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
