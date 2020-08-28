package com.example.imdb.model;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class Tvseries {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String title;
    private LocalDate release;
    private String description;
    private Double rating;
    private Boolean finished = Boolean.TRUE;

    @ManyToMany
    @JoinTable(name = "Tvseries_genre",
            joinColumns = {@JoinColumn(name = "tvseries_id")},
            inverseJoinColumns = {@JoinColumn(name = "genre_id")})
    private Set<Genre> genretypes = new HashSet<>();
}
