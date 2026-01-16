/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MovieDatabase {

    private static MovieDatabase instance = null;

    public static MovieDatabase getInstance() {
        if (instance == null) {
            instance = new MovieDatabase();
        }
        return instance;
    }

    // ArrayList for storing all movies
    private ArrayList<Movie> allMovies;

    // BUILT-IN LinkedList for dashboard (5 most recent movies)
    private LinkedList<Movie> dashboardMovies;

    // BUILT-IN Queue for history (deleted movies)
    private Queue<Movie> historyQueue;

    // BUILT-IN Stack for undo (only for deleted movies)
    private Stack<Movie> undoStack;

    private MovieDatabase() {
        allMovies = new ArrayList<>();
        dashboardMovies = new LinkedList<>();
        historyQueue = new LinkedList<>();
        undoStack = new Stack<>();

        loadDummyData();
    }

    private void loadDummyData() {
        // Add 5 dummy movies
        Movie m1 = new Movie(1, "Titanic", "James Cameron", 1997, "Drama", 5);
        Movie m2 = new Movie(2, "The Godfather", "Francis Ford Coppola", 1972, "Crime", 5);
        Movie m3 = new Movie(3, "The Dark Knight", "Christopher Nolan", 2008, "Action", 5);
        Movie m4 = new Movie(4, "Pulp Fiction", "Quentin Tarantino", 1994, "Crime", 4);
        Movie m5 = new Movie(5, "Inception", "Christopher Nolan", 2010, "Sci-Fi", 5);

        // Add to all movies
        allMovies.add(m1);
        allMovies.add(m2);
        allMovies.add(m3);
        allMovies.add(m4);
        allMovies.add(m5);

        // Add to dashboard (5 most recent) - USING BUILT-IN LINKEDLIST
        dashboardMovies.addFirst(m5); // Most recent
        dashboardMovies.addFirst(m4);
        dashboardMovies.addFirst(m3);
        dashboardMovies.addFirst(m2);
        dashboardMovies.addFirst(m1); // Oldest in dashboard

        // Ensure dashboard has only 5 movies
        while (dashboardMovies.size() > 5) {
            dashboardMovies.removeLast();
        }
    }

    public boolean isIdExists(int id) {
        for (Movie movie : allMovies) {
            if (movie.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public boolean isTitleExists(String title) {
        for (Movie movie : allMovies) {
            if (movie.getTitle().equalsIgnoreCase(title.trim())) {
                return true;
            }
        }
        return false;
    }

    public Movie addMovie(int id, String title, String director, int year, String genre, int rating) {
        Movie newMovie = new Movie(id, title, director, year, genre, rating);

        // Add to all movies
        allMovies.add(newMovie);

        // Add to dashboard (most recent first) - USING BUILT-IN LINKEDLIST
        dashboardMovies.addFirst(newMovie);

        // Keep only 5 movies in dashboard
        if (dashboardMovies.size() > 5) {
            dashboardMovies.removeLast();
        }

        return newMovie;
    }

    public boolean updateMovie(int id, String title, String director, int year, String genre, int rating) {
        for (Movie movie : allMovies) {
            if (movie.getId() == id) {
                if (title != null && !title.isEmpty()) {
                    movie.setTitle(title);
                }
                if (director != null && !director.isEmpty()) {
                    movie.setDirector(director);
                }
                if (year > 0) {
                    movie.setYear(year);
                }
                if (genre != null && !genre.isEmpty()) {
                    movie.setGenre(genre);
                }
                if (rating > 0) {
                    movie.setRating(rating);
                }

                updateDashboard();
                return true;
            }
        }
        return false;
    }

    private void updateDashboard() {
        // Clear dashboard and add 5 most recent movies
        dashboardMovies.clear();

        // Add 5 most recent movies from allMovies (newest first)
        int count = 0;
        for (int i = allMovies.size() - 1; i >= 0 && count < 5; i--) {
            dashboardMovies.addFirst(allMovies.get(i));
            count++;
        }
    }

    public Movie deleteMovie(int id) {
        Movie movieToDelete = null;

        // Find movie in allMovies
        for (Movie movie : allMovies) {
            if (movie.getId() == id) {
                movieToDelete = movie;
                break;
            }
        }

        if (movieToDelete != null) {
            // Remove from allMovies
            allMovies.remove(movieToDelete);

            // Add to history Queue - USING BUILT-IN QUEUE
            historyQueue.offer(movieToDelete);

            // Push to undo Stack - USING BUILT-IN STACK
            undoStack.push(movieToDelete);

            // Update dashboard
            updateDashboard();

            return movieToDelete;
        }

        return null;
    }

    public boolean undoDelete() {
        if (!undoStack.isEmpty()) {
            Movie movieToRestore = undoStack.pop();

            // Remove from history Queue
            boolean removedFromHistory = historyQueue.remove(movieToRestore);

            if (removedFromHistory) {
                // Add back to allMovies
                allMovies.add(movieToRestore);

                // Update dashboard
                updateDashboard();

                return true;
            }
        }
        return false;
    }

    public Movie getLastDeletedMovie() {
        if (!undoStack.isEmpty()) {
            return undoStack.peek();
        }
        return null;
    }

    public ArrayList<Movie> getAllMovies() {
        return new ArrayList<>(allMovies);
    }

    // CHANGE THIS TO RETURN LINKEDLIST
    public LinkedList<Movie> getDashboardMovies() {
        return new LinkedList<>(dashboardMovies);
    }

    public ArrayList<Movie> getHistory() {
        return new ArrayList<>(historyQueue);
    }

    public void clearHistory() {
        historyQueue.clear();
        undoStack.clear();
    }

    public Movie getMovieById(int id) {
        for (Movie movie : allMovies) {
            if (movie.getId() == id) {
                return movie;
            }
        }
        return null;
    }

    public int getTotalMovies() {
        return allMovies.size();
    }

    public int getTotalHistory() {
        return historyQueue.size();
    }

    public boolean isUndoAvailable() {
        return !undoStack.isEmpty();
    }
}
