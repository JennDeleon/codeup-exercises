package movies;

import util.Input;

import java.util.Arrays;

public class MoviesApplication {
    // movies need to be instance variable so that addMovie can reassign the array
    private static Movie [] movies = MoviesArray.findAll();

    private static Input input = new Input();

    public static void main(String[] args) {
        // highest level of detail for what this program is about
        // do user choice from menu until user decides to quit
        int choice = 0;
        do {
            printMenu();

            // get menu choice from user
            choice = input.getInt("Enter your choice: ",0, 6);

            doUserChoice(choice, movies);

        } while(choice != 0);

        input.close();
    }

    private static void printMenu() {
        System.out.println("What would you like to do?\n" +
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
        // do add movie functionality here!
        String movieName = input.getString("Enter movie name: ");
        String category = input.getString("Enter movie category: ");
        Movie movie = new Movie(movieName, category);

        // make a new movies array that is 1 larger than previous
        movies = Arrays.copyOf(movies, movies.length + 1);
        // assign new movie the end of the array
        movies[movies.length - 1] = movie;
    }

    private static void printMovies(Movie[] movies, String category) {
        for(Movie movie: movies) {
            // all movies or the movie matches the given category, then print it
            // category == "" ->  is "all movies"
            if(category.length() == 0 || movie.getCategory().equalsIgnoreCase(category)) {
                System.out.println(movie);
            }
        }
        System.out.println();
    }
}

// using this for review, need to change it to right as my own with a better understanding

