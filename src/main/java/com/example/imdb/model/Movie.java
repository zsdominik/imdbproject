package com.example.imdb.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Value;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

@Value
@Entity
public class Movie extends BaseMedia {
    @JsonIgnore
    @ManyToMany
    @JoinTable(
            name = "Movie_genre",
            joinColumns = {@JoinColumn(name = "movie_id")},
            inverseJoinColumns = {@JoinColumn(name = "genre_id")})
    Set<Genre> genres = new HashSet<>();

}
