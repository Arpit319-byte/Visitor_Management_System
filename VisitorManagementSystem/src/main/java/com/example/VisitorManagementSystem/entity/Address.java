package com.example.VisitorManagementSystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Address {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column(nullable = false)
    private String pincode;

    @Column(nullable = false)
    private String line1;

    @Column(nullable = false)
    private String line2;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String country;

}
