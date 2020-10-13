package com.example.imdb.controller;

import com.example.imdb.model.Tvseries;
import com.example.imdb.service.TvseriesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/tvseries")
public class TvseriesController {

    private final TvseriesService tvseriesService;

    public TvseriesController(TvseriesService tvseriesService) {
        this.tvseriesService = tvseriesService;
    }

    @GetMapping("/")
    public List<Tvseries> getAllSeries() {
        return tvseriesService.getAllSeries();
    }

    @GetMapping("/{id}")
    public Tvseries getTvseries(@PathVariable("id") String id) {
        return tvseriesService.getTvseries(id);
    }

    @PostMapping("/")
    public Tvseries createTvseries(@RequestBody Tvseries tvseries) {
        return tvseriesService.createTvseries(tvseries);
    }

    @PutMapping("/{id}")
    public Tvseries updateTvseries(@RequestBody() Tvseries newTvseries, @PathVariable("id") String id) {
        return tvseriesService.updateTvseries(newTvseries, id);
    }

    @DeleteMapping("/{id}")
    public void deleteTvseries(@PathVariable("id") String id) {
        tvseriesService.deleteTvseries(id);
    }
}
