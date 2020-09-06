package com.example.imdb.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Value;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

@Value
@Entity
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    @Column(nullable = false)
    private String name;
    @JsonIgnore
    @ManyToMany(mappedBy = "genres")
    private Set<Movie> movies = new HashSet<>();
    @JsonIgnore
    @ManyToMany(mappedBy = "genretypes")
    private Set<Tvseries> tvseries = new HashSet<>();
}
