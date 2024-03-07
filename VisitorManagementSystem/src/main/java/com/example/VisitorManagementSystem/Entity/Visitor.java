package com.example.VisitorManagementSystem.Entity;

import jakarta.persistence.*;
import lombok.Cleanup;

import java.time.OffsetDateTime;

@Entity
public class Visitor {

    @Id
    @Column(nullable=false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false,unique = true)
    private String phoneNumber;
    private Address address;
    private String purpose;
    private String imageUrl;

    private OffsetDateTime inTime;
    private OffsetDateTime outTime;
}
