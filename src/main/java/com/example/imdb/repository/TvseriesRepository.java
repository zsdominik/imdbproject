package com.example.imdb.repository;

import com.example.imdb.model.Tvseries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TvseriesRepository extends JpaRepository<Tvseries, String> {
}
