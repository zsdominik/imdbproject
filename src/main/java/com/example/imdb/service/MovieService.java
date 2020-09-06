package com.example.imdb.service;

import com.example.imdb.model.Movie;
import com.example.imdb.repository.MovieRepository;
import javassist.NotFoundException;
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
    //create movie
    public Movie createMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    //update movie
    public Movie updateMovie(Movie newMovie, String id){
        return movieRepository.findById(id)
                .map(movie -> {
                    movie.setTitle(newMovie.getTitle());
                    movie.setRelease(newMovie.getRelease());
                    movie.setDescription(newMovie.getDescription());
                    movie.setRating(newMovie.getRating());
                    return movieRepository.save(newMovie);
            })
                .orElseGet(()->{
                    newMovie.setId(id);
                    return movieRepository.save(newMovie);
                });
        }
    //delete movie
    public void deleteMovie(String id) {
        movieRepository.deleteById(id);
    }
}
