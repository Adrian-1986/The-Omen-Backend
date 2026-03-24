package org.example.model;

// Represents a movie entity in the system.
public class Movie {
    private int id;
    private String title;
    private String genre;

    // Empty constructor for simple instantiation.
    public Movie() {
    }

    // Constructor with all fields.
    public Movie(int id, String title, String genre) {
        this.id = id;
        this.title = title;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
