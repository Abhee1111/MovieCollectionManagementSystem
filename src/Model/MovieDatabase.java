/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Singleton class managing the movie database.
 * Uses multiple data structures for efficient CRUD operations:
 * - ArrayList for storing all movies
 * - LinkedList for dashboard (5 most recent movies)
 * - Queue for tracking delete history
 * - Stack for undo functionality
 * 
 * @author giria
 */
public class MovieDatabase {

    private static MovieDatabase instance = null;

    /**
     * Gets the singleton instance of MovieDatabase.
     * Implements singleton pattern to ensure only one database instance exists.
     * 
     * @return The singleton MovieDatabase instance
     */
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

    /**
     * Private constructor for singleton pattern.
     * Initializes all data structures and loads dummy data for demonstration.
     */
    private MovieDatabase() {
        allMovies = new ArrayList<>();
        dashboardMovies = new LinkedList<>();
        historyQueue = new LinkedList<>();
        undoStack = new Stack<>();

        loadDummyData();
    }

    /**
     * Loads 5 dummy movies into the database for demonstration purposes.
     * Populates both the main movie list and the dashboard with sample data.
     */
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

    /**
     * Checks if a movie ID already exists in the database.
     * Prevents duplicate ID entries during movie addition.
     * 
     * @param id The movie ID to check
     * @return true if ID exists, false otherwise
     */
    public boolean isIdExists(int id) {
        for (Movie movie : allMovies) {
            if (movie.getId() == id) {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks if a movie title already exists in the database.
     * Case-insensitive comparison to prevent duplicate titles.
     * 
     * @param title The movie title to check
     * @return true if title exists, false otherwise
     */
    public boolean isTitleExists(String title) {
        for (Movie movie : allMovies) {
            if (movie.getTitle().equalsIgnoreCase(title.trim())) {
                return true;
            }
        }
        return false;
    }

    /**
     * Adds a new movie to the database.
     * Automatically updates the dashboard to show the 5 most recent movies.
     * Uses LinkedList addFirst() for O(1) insertion at the front.
     * 
     * @param id Unique movie ID
     * @param title Movie title
     * @param director Director name
     * @param year Release year
     * @param genre Movie genre
     * @param rating User rating (1-5)
     * @return The newly created Movie object
     */
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

    /**
     * Updates an existing movie's details.
     * Only updates fields that are provided (non-null and non-empty).
     * Refreshes the dashboard after update to maintain correct order.
     * 
     * @param id Movie ID to update
     * @param title New title (or null/empty to keep existing)
     * @param director New director (or null/empty to keep existing)
     * @param year New year (or 0 to keep existing)
     * @param genre New genre (or null/empty to keep existing)
     * @param rating New rating (or 0 to keep existing)
     * @return true if update successful, false if movie not found
     */
    public boolean updateMovie(int id, String title, String director, int year, String genre, int rating) {
        for (Movie movie : allMovies) {
            if (movie.getId() == id) {
                // Update only non-empty fields
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

    /**
     * Refreshes the dashboard to show the 5 most recently added movies.
     * Called after add, update, and delete operations to maintain consistency.
     * Uses LinkedList for efficient front insertion.
     */
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

    /**
     * Deletes a movie from the database.
     * Moves the deleted movie to history (Queue) and undo stack for potential restoration.
     * Uses Queue offer() for FIFO history tracking and Stack push() for LIFO undo.
     * 
     * @param id The ID of the movie to delete
     * @return The deleted Movie object, or null if not found
     */
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

    /**
     * Undoes the last delete operation.
     * Restores the most recently deleted movie from the undo stack.
     * Uses Stack pop() for LIFO retrieval and removes from history queue.
     * 
     * @return true if undo successful, false if stack is empty
     */
    public boolean undoDelete() {
        if (!undoStack.isEmpty()) {
            // Pop from undo stack
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

    /**
     * Gets the most recently deleted movie without removing it from the stack.
     * Uses Stack peek() to view top element without modification.
     * 
     * @return The last deleted Movie, or null if no deletions
     */
    public Movie getLastDeletedMovie() {
        if (!undoStack.isEmpty()) {
            return undoStack.peek();
        }
        return null;
    }

    /**
     * Returns a copy of all movies in the database.
     * Creates a new ArrayList to prevent external modification.
     * 
     * @return ArrayList containing all movies
     */
    public ArrayList<Movie> getAllMovies() {
        return new ArrayList<>(allMovies);
    }

    /**
     * Returns a copy of the dashboard movies (5 most recent).
     * 
     * @return LinkedList containing up to 5 most recent movies
     */
    public LinkedList<Movie> getDashboardMovies() {
        return new LinkedList<>(dashboardMovies);
    }

    /**
     * Returns a copy of the delete history.
     * Converts Queue to ArrayList for easy iteration.
     * 
     * @return ArrayList containing all deleted movies in chronological order
     */
    public ArrayList<Movie> getHistory() {
        return new ArrayList<>(historyQueue);
    }

    /**
     * Clears all delete history and undo stack.
     * Permanently removes all deleted movies from tracking.
     */
    public void clearHistory() {
        historyQueue.clear();
        undoStack.clear();
    }

    /**
     * Retrieves a movie by its unique ID.
     * Linear search through all movies.
     * 
     * @param id The movie ID to search for
     * @return The Movie object if found, null otherwise
     */
    public Movie getMovieById(int id) {
        for (Movie movie : allMovies) {
            if (movie.getId() == id) {
                return movie;
            }
        }
        return null;
    }

    /**
     * Gets the total count of movies in the database.
     * 
     * @return Total number of movies
     */
    public int getTotalMovies() {
        return allMovies.size();
    }

    /**
     * Gets the total count of deleted movies in history.
     * 
     * @return Number of movies in delete history
     */
    public int getTotalHistory() {
        return historyQueue.size();
    }

    /**
     * Checks if undo operation is available.
     * 
     * @return true if there are movies in the undo stack, false otherwise
     */
    public boolean isUndoAvailable() {
        return !undoStack.isEmpty();
    }
}