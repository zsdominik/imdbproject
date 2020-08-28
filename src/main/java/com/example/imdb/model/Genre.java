package com.example.imdb.model;

import lombok.Data;

import javax.annotation.processing.Generated;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    @Enumerated(EnumType.STRING)
    private EGenre name;
    @ManyToMany(mappedBy = "genres")
    private Set<Movie> Movies = new HashSet<>();

    @ManyToMany(mappedBy = "genretypes")
    private Set<Tvseries> Tvseries = new HashSet<>();
}