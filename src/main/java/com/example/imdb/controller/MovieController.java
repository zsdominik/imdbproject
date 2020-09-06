package com.example.imdb.controller;

import com.example.imdb.model.Movie;
import com.example.imdb.service.MovieService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/movies")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/")
    public List<Movie> getAllMovies() { return movieService.getAllMovies(); }

    @GetMapping("/{id}")
    public Movie getMovie(@PathVariable String id) {
        return movieService.getMovie(id);
    }

    @PostMapping("/")
    public Movie createMovie(Movie movie) {
        return movieService.createMovie(movie);
    }

    @PutMapping("/{id}")
    public Movie updateMovie(Movie newMovie,@PathVariable String id){
        return movieService.updateMovie(newMovie, id);
    }
    @DeleteMapping("/{id}")
    public void deleteMovie(@PathVariable String id){
        movieService.deleteMovie(id);
    }
}
