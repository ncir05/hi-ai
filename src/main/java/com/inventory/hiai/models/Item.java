package com.inventory.hiai.models;

import com.inventory.hiai.enums.Category;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Component
@Data
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private double value;
    private String location;
    private Category category;
    private String photo;
}
