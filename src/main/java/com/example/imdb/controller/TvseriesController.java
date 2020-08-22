package com.example.imdb.controller;

import com.example.imdb.model.Tvseries;
import com.example.imdb.service.TvseriesService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class TvseriesController {

    private final TvseriesService tvseriesService;

    public TvseriesController(TvseriesService tvseriesService) {
        this.tvseriesService = tvseriesService;
    }

    @GetMapping("/tvseries")
    public List<Tvseries> getAllSeries() {
        return tvseriesService.getAllSeries();
    }
}
