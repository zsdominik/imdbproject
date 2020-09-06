package com.example.imdb.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Data
public class BaseMedia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private LocalDate release;
    private String description;
    private Double rating;
}
