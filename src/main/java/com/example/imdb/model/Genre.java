package com.example.imdb.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Value;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

@Value
@Entity
public class Genre {
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    String id;
    @Column(nullable = false)
    String name;
    @JsonIgnore
    @ManyToMany(mappedBy = "genres")
    Set<Movie> movies = new HashSet<>();
    @JsonIgnore
    @ManyToMany(mappedBy = "genretypes")
    Set<Tvseries> tvseries = new HashSet<>();
}
