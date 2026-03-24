package org.example;

import org.example.controller.MovieController;
import org.example.model.Movie;
import org.example.view.MovieView;
import util.LanguageManager;

import java.util.List;
import java.util.Scanner;

public class Main {
    // Entry point for the console application.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MovieController controller = new MovieController();
        MovieView view = new MovieView();

        // Seleccion inicial de idioma para cargar el ResourceBundle correcto.
        System.out.println("Selecciona idioma / Select language:");
        System.out.println("1. Espanol");
        System.out.println("2. English");
        System.out.print("Opcion: ");
        String langOption = scanner.nextLine();
        if ("2".equals(langOption)) {
            LanguageManager.setLanguage("en");
        } else {
            LanguageManager.setLanguage("es");
        }

        boolean running = true;
        while (running) {
            System.out.println("1. " + LanguageManager.get("menu.create"));
            System.out.println("2. " + LanguageManager.get("menu.view"));
            System.out.println("3. " + LanguageManager.get("menu.exit"));
            System.out.print(LanguageManager.get("menu.option") + " ");

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
