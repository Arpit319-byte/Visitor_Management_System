package com.example.VisitorManagementSystem.Repository;

import com.example.VisitorManagementSystem.Entity.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Owner,Long> {
}
