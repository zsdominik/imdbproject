package com.example.imdb.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import javax.persistence.Column;
import java.util.Set;

@Data
@Entity
public class Tvseries extends BaseMedia {
    @Column(name = "isfinished",columnDefinition = "boolean default true")
    private Boolean isFinished;
    @JsonIgnore
    @ManyToMany
    @JoinTable(
            name = "Tvseries_genre",
            joinColumns = {@JoinColumn(name = "tvseries_id")},
            inverseJoinColumns = {@JoinColumn(name = "genre_id")})
    private Set<Genre> genretypes = new HashSet<>();
}
