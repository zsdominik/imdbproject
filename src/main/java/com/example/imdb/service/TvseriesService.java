package com.example.imdb.service;

import com.example.imdb.model.Movie;
import com.example.imdb.model.Tvseries;
import com.example.imdb.repository.TvseriesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TvseriesService {

    private final TvseriesRepository tvseriesRepository;

    public TvseriesService(TvseriesRepository tvseriesRepository) {
        this.tvseriesRepository = tvseriesRepository;
    }

    public List<Tvseries> getAllSeries() {
        // TODO business logic
        return tvseriesRepository.findAll();
    }
}
