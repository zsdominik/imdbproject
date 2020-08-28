package com.example.imdb;

import com.example.imdb.model.EGenre;
import com.example.imdb.model.Genre;
import com.example.imdb.model.Movie;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import java.util.Set;

@SpringBootApplication
public class ImdbApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImdbApplication.class, args);
    }

}
