package com.example.imdb.service;

import com.example.imdb.model.Movie;
import com.example.imdb.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }
    //get movies
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }
    //get movie by id
    public Movie getMovie(String id) {
        return movieRepository.findById(id).get();
    }
    //save movie
    public void createMovie(Movie movie) {
        movieRepository.save(movie);
    }

    //update movie


    //delete movie
    public void deleteMovie(String id) {
        movieRepository.deleteById(id);
    }
}
