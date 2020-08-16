package com.example.imdb.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Movie {
    @Id @GeneratedValue
    private String id;
    private String title;
    private Integer year;
    private String description;
    private Double rating;
}
