package com.cydeo.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
@MappedSuperclass //we don't create a table for a parent class, this class provides only inheritance relationships to other entities

public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String owner;
    private BigDecimal balance;
    private BigDecimal interestRate;

}
