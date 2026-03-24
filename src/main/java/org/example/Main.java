package org.example;

import org.example.controller.MovieController;
import org.example.model.Movie;
import org.example.view.MovieView;

import java.util.List;
import java.util.Scanner;

public class Main {
    // Entry point for the console application.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MovieController controller = new MovieController();
        MovieView view = new MovieView();

        boolean running = true;
        while (running) {
            System.out.println("1. Crear película");
            System.out.println("2. Ver películas");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");

            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    System.out.print("Título: ");
                    String title = scanner.nextLine();
                    System.out.print("Género: ");
                    String genre = scanner.nextLine();
                    controller.createMovie(title, genre);
                    System.out.println("Película creada correctamente");
                    break;
                case "2":
                    List<Movie> movies = controller.getAllMovies();
                    view.showMovies(movies);
                    break;
                case "3":
                    System.out.println("Saliendo...");
                    running = false;
                    break;
                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
                    break;
            }
        }
    }
}
