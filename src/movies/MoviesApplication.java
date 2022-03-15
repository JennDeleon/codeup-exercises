package movies;

import util.Input;

import java.util.Arrays;

public class MoviesApplication {
    private static Movie [] movies = MoviesArray.findAll();

    private static Input input = new Input();

    public static void main(String[] args) {
        int choice = 0;
        do {
            printMenu();
            choice = input.getInt("Enter your number choice here: ",0, 6);

            doUserChoice(choice, movies);

        } while(choice != 0);

        input.close();
    }

    private static void printMenu() {
        System.out.println("Here is the choices you have to select from:" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n" +
                "6 - add movie\n");
    }

    private static void doUserChoice(int choice, Movie[] movies) {
        switch(choice) {
            case 1:
                printMovies(movies, "");
                break;
            case 2:
                printMovies(movies, "animated");
                break;
            case 3:
                printMovies(movies, "drama");
                break;
            case 4:
                printMovies(movies, "horror");
                break;
            case 5:
                printMovies(movies, "scifi");
                break;
            case 6:
                addMovie();
                break;
            default:
                break;
        }
    }

    private static void addMovie() {

        String movieName = input.getString("Whiich movie name? ");
        String category = input.getString("Which movie category? ");
        Movie movie = new Movie(movieName, category);

        movies = Arrays.copyOf(movies, movies.length + 1);
        movies[movies.length - 1] = movie;
    }

    private static void printMovies(Movie[] movies, String category) {
        for(Movie movie: movies) {
            if(category.length() == 0 || movie.getCategory().equalsIgnoreCase(category)) {
                System.out.println(movie);
            }
        }
        System.out.println();
    }
}
