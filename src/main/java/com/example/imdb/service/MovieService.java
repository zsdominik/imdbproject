package com.example.imdb.service;

import com.example.imdb.model.Movie;
import com.example.imdb.repository.MovieRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> getAllMovies() {
        // TODO business logic
        return movieRepository.findAll();
    }

    public void saveMovie(Movie movie) {
        movieRepository.save(movie);
    }

    public Movie getMovie(String id) {
        return movieRepository.findById(id).get();
    }

    public void deleteMovie(String id) {
        movieRepository.deleteById(id);
    }

}
