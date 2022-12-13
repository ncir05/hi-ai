package com.inventory.hiai.entities;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@SuperBuilder
public class Items {

    public Items() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int quantity;
    private String name;
    private String description;
    private double value;
    private String location;
    private String category;
    private String photo;

}

