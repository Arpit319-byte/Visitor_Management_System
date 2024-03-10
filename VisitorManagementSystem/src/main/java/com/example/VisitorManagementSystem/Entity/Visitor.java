package com.example.VisitorManagementSystem.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.OffsetDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Visitor {

    @Id
    @Column(nullable=false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false,unique = true)
    private String phoneNumber;
    @Column(nullable = false)
    private Address address;

    @Column(nullable = false)
    private String purpose;
    @Column(nullable = false)
    private String imageUrl;

    @Column(nullable = false)
    private OffsetDateTime inTime;
    @Column(nullable = false)
    private OffsetDateTime outTime;
}
