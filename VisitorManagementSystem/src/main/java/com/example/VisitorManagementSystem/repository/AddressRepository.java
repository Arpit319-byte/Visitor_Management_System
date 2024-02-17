package com.example.VisitorManagementSystem.repository;

import com.example.VisitorManagementSystem.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Long> {
}
