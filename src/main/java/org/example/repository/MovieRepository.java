package org.example.repository;

import org.example.database.DBConnection;
import org.example.model.Movie;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

// Data access layer for Movie using JDBC.
public class MovieRepository {
    // Inserts a movie into the database.
    public void save(Movie movie) {
        String sql = "INSERT INTO movies (title, genre) VALUES (?, ?)";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement statement = connection != null ? connection.prepareStatement(sql) : null) {
            if (statement == null) {
                return;
            }
            statement.setString(1, movie.getTitle());
            statement.setString(2, movie.getGenre());
            statement.executeUpdate();
        } catch (SQLException e) {
            // Prints the error so it is easy to debug database issues.
            e.printStackTrace();
        }
    }

    // Returns all movies from the database.
    public List<Movie> findAll() {
        List<Movie> movies = new ArrayList<>();
        String sql = "SELECT * FROM movies";

        try (Connection connection = DBConnection.getConnection();
             Statement statement = connection != null ? connection.createStatement() : null;
             ResultSet resultSet = statement != null ? statement.executeQuery(sql) : null) {
            if (resultSet == null) {
                return movies;
            }
            while (resultSet.next()) {
                Movie movie = new Movie();
                movie.setId(resultSet.getInt("id"));
                movie.setTitle(resultSet.getString("title"));
                movie.setGenre(resultSet.getString("genre"));
                movies.add(movie);
            }
        } catch (SQLException e) {
            // Prints the error so it is easy to debug database issues.
            e.printStackTrace();
        }

        return movies;
    }
}
