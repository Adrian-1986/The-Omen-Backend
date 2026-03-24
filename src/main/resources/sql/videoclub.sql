-- Create the database if it does not exist
CREATE DATABASE IF NOT EXISTS videoclub;

-- Use the database
USE videoclub;

-- Create the movies table
CREATE TABLE IF NOT EXISTS movies (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    genre VARCHAR(100) NOT NULL
);

-- Insert sample data
INSERT INTO movies (title, genre) VALUES ('The Matrix', 'Sci-Fi');
INSERT INTO movies (title, genre) VALUES ('Toy Story', 'Animation');
INSERT INTO movies (title, genre) VALUES ('Inception', 'Thriller');
