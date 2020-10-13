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

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Movie getMovie(String id) { return movieRepository.findById(id).get(); }
    public Movie createMovie(Movie movie) {
        return movieRepository.save(movie);
    }

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
    public void deleteMovie(String id) { movieRepository.deleteById(id); }
}
