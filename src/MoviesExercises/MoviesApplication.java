package MoviesExercises;


import PersonExercises.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        Movie[] movies = MoviesArray.findAll();
        Input input = new Input();

        System.out.println("What would you like to do?\n");
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category");

        boolean exit = false;
        do {
            int choice = input.getInt(0, 5);

            switch (choice) {
                case 0:
                    exit = true;
                    break;
                case 1:
                    displayMovies(movies);
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                    displayMoviesByCategory(movies, getCategoryName(choice));
                    break;
            }
        } while (!exit);

        System.out.println("Goodbye!");
    }

    private static void displayMovies(Movie[] movies) {
        for (Movie movie : movies) {
            System.out.println(movie.getName() + " -- " + movie.getCategory());
        }
    }

    private static void displayMoviesByCategory(Movie[] movies, String category) {
        for (Movie movie : movies) {
            if (movie.getCategory().equalsIgnoreCase(category)) {
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }
    }

    private static String getCategoryName(int choice) {
        switch (choice) {
            case 2:
                return "Action";
            case 3:
                return "drama";
            case 4:
                return "horror";
            case 5:
                return "scifi";
            default:
                return "";
        }
    }
}
