package com.example.imdb.service;

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

    public List<Tvseries> getAllSeries() { return tvseriesRepository.findAll(); }

    public Tvseries getTvseries(String id) {
        return tvseriesRepository.findById(id).get();
    }

    public Tvseries createTvseries(Tvseries tvseries) {
        return tvseriesRepository.save(tvseries);
    }

    public Tvseries updateTvseries(Tvseries newTvseries, String id) {
        return tvseriesRepository.findById(id)
                .map(tvseries -> {
                    tvseries.setTitle(newTvseries.getTitle());
                    tvseries.setRelease(newTvseries.getRelease());
                    tvseries.setDescription(newTvseries.getDescription());
                    tvseries.setRating(newTvseries.getRating());
                    return tvseriesRepository.save(newTvseries);
                })
                .orElseGet(() -> {
                    newTvseries.setId(id);
                    return tvseriesRepository.save(newTvseries);
                });
    }

    public void deleteTvseries(String id) {
        tvseriesRepository.deleteById(id);
    }

}
