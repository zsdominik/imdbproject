package com.example.imdb.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Tvseries {
    @Id
    @GeneratedValue
    private String id;
    private String title;
    private Integer release;
    private String description;
    private Double rating;
    private Genre genre = Genre.ACTION;
    private Boolean finished=Boolean.TRUE;
}
