package com.example.VisitorManagementSystem.entity;

import com.example.VisitorManagementSystem.model.VisitStatus;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;

public class Visit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column()
    private Long id;

    @Column(nullable = false)
    private Long noOfPeople;


    private VisitStatus status;


    private String urlOfPhoto;

    private String purposeVisit;

    private LocalTime inTime;

    private LocalTime outTime;

    private OffsetDateTime createdDate;

    private OffsetDateTime lastUpdated;


}
