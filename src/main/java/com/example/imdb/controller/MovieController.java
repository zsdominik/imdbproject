package com.example.imdb.controller;

import com.example.imdb.model.Movie;
import com.example.imdb.service.MovieService;
import com.sun.xml.bind.v2.runtime.output.SAXOutput;
import org.springframework.dao.EmptyResultDataAccessException;
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
    public Movie getMovie(@PathVariable("id") String id) {
        return movieService.getMovie(id);
    }

    @PostMapping("/")
    public Movie createMovie(@RequestBody Movie movie) {
        return movieService.createMovie(movie);
    }

    @PutMapping("/{id}")
    public Movie updateMovie(@RequestBody() Movie newMovie, @PathVariable("id") String id) {
        return movieService.updateMovie(newMovie, id);
    }

    @DeleteMapping("/{id}")
    public void deleteMovie(@PathVariable("id") String id){ movieService.deleteMovie(id); }
}
