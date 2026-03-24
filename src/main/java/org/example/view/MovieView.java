package org.example.view;

import org.example.model.Movie;

import java.util.List;

// Handles simple console output for movies.
public class MovieView {
    // Prints a list of movies to the console.
    public void showMovies(List<Movie> movies) {
        if (movies == null || movies.isEmpty()) {
            System.out.println("No hay películas disponibles");
            return;
        }

        for (Movie movie : movies) {
            System.out.println("ID: " + movie.getId()
                    + " | Título: " + movie.getTitle()
                    + " | Género: " + movie.getGenre());
        }
    }
}
