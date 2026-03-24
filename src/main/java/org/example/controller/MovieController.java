package org.example.controller;

import org.example.model.Movie;
import org.example.repository.MovieRepository;

import java.util.List;

// Coordinates requests between view and repository.
public class MovieController {
    private final MovieRepository repository;

    // Creates the controller with its repository.
    public MovieController() {
        this.repository = new MovieRepository();
    }

    // Creates a Movie and saves it through the repository.
    public void createMovie(String title, String genre) {
        Movie movie = new Movie();
        movie.setTitle(title);
        movie.setGenre(genre);
        repository.save(movie);
    }

    // Returns all movies from the repository.
    public List<Movie> getAllMovies() {
        return repository.findAll();
    }
}
