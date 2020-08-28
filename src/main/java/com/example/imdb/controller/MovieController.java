package com.example.imdb.controller;

import com.example.imdb.model.Movie;
import com.example.imdb.service.MovieService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/movies")
    public List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }

    @GetMapping("/movies/{id}")
    public Movie getMovie(@PathVariable String id) {
        return movieService.getMovie(id);
    }

    @PostMapping("/movies/save")
    public void saveMovie(Movie movie) {
        movieService.saveMovie(movie);
    }
}
