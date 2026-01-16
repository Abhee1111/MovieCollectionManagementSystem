/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Movie;
import Model.MovieDatabase;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class MovieController {

    private MovieDatabase database;

    public MovieController() {
        database = MovieDatabase.getInstance();
    }

    // ============ CRUD Operations ============
    public boolean addMovie(int id, String title, String director, int year, String genre, int rating, JFrame parentFrame) {
        // Check for duplicate ID
        if (database.isIdExists(id)) {
            JOptionPane.showMessageDialog(parentFrame, "Movie ID already exists! Please use a different ID.", "Duplicate ID", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Check for duplicate title (case insensitive)
        if (database.isTitleExists(title)) {
            JOptionPane.showMessageDialog(parentFrame, "Movie title already exists! Please use a different title.", "Duplicate Title", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (id < 0) {
            JOptionPane.showMessageDialog(parentFrame, "Movie ID cannot be negative!", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (title == null || title.trim().isEmpty()) {
            JOptionPane.showMessageDialog(parentFrame, "Movie title cannot be empty!", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (director == null || director.trim().isEmpty()) {
            JOptionPane.showMessageDialog(parentFrame, "Director name cannot be empty!", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (year < 1900 || year > 2025) {
            JOptionPane.showMessageDialog(parentFrame, "Year must be between 1900 and 2025!", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (rating < 1 || rating > 5) {
            JOptionPane.showMessageDialog(parentFrame, "Rating must be between 1 and 5!", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        Movie newMovie = database.addMovie(id, title, director, year, genre, rating);

        JOptionPane.showMessageDialog(parentFrame,
                "Movie added successfully!\n\n"
                + "ID: " + newMovie.getId() + "\n"
                + "Title: " + newMovie.getTitle() + "\n"
                + "Added to dashboard (5 most recent movies)",
                "Success",
                JOptionPane.INFORMATION_MESSAGE);
        return true;
    }

    public boolean updateMovie(int id, String title, String director, int year, String genre, String ratingStr, JFrame parentFrame) {
        // Check if movie exists
        Movie existingMovie = database.getMovieById(id);
        if (existingMovie == null) {
            JOptionPane.showMessageDialog(parentFrame, "Movie ID not found!", "Update Failed", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Prepare update values (use existing values if new ones are empty)
        String newTitle = (title != null && !title.trim().isEmpty()) ? title.trim() : existingMovie.getTitle();
        String newDirector = (director != null && !director.trim().isEmpty()) ? director.trim() : existingMovie.getDirector();
        int newYear = (year > 0) ? year : existingMovie.getYear();
        String newGenre = (genre != null && !genre.trim().isEmpty()) ? genre.trim() : existingMovie.getGenre();
        int newRating;

        // Handle rating (if provided, parse it; otherwise use existing)
        if (ratingStr != null && !ratingStr.trim().isEmpty()) {
            try {
                newRating = Integer.parseInt(ratingStr.trim());
                if (newRating < 1 || newRating > 5) {
                    JOptionPane.showMessageDialog(parentFrame, "Rating must be between 1 and 5!", "Validation Error", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(parentFrame, "Rating must be a number between 1-5!", "Invalid Rating", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } else {
            newRating = existingMovie.getRating();
        }

        // Validate year if changed
        if (newYear < 1900 || newYear > 2025) {
            JOptionPane.showMessageDialog(parentFrame, "Year must be between 1900 and 2025!", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Check for duplicate title (only if title is being changed)
        if (!newTitle.equals(existingMovie.getTitle()) && database.isTitleExists(newTitle)) {
            JOptionPane.showMessageDialog(parentFrame, "Movie title already exists! Please use a different title.", "Duplicate Title", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        boolean success = database.updateMovie(id, newTitle, newDirector, newYear, newGenre, newRating);

        if (success) {
            JOptionPane.showMessageDialog(parentFrame,
                    "Movie updated successfully!\n\n"
                    + "ID: " + id + "\n"
                    + "Updated fields will be reflected in all tables",
                    "Success",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(parentFrame, "Update failed!", "Update Failed", JOptionPane.ERROR_MESSAGE);
        }
        return success;
    }

    public boolean deleteMovie(int id, JFrame parentFrame) {
        // Check if movie exists
        Movie existingMovie = database.getMovieById(id);
        if (existingMovie == null) {
            JOptionPane.showMessageDialog(parentFrame, "Movie ID not found!", "Delete Failed", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        int confirm = JOptionPane.showConfirmDialog(parentFrame,
                "Are you sure you want to delete this movie?\n\n"
                + "ID: " + existingMovie.getId() + "\n"
                + "Title: " + existingMovie.getTitle() + "\n"
                + "Director: " + existingMovie.getDirector() + "\n\n"
                + "This movie will be moved to History and can be undone.",
                "Confirm Delete",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE);

        if (confirm == JOptionPane.YES_OPTION) {
            Movie deletedMovie = database.deleteMovie(id);

            if (deletedMovie != null) {
                JOptionPane.showMessageDialog(parentFrame,
                        "Movie deleted successfully!\n\n"
                        + "Moved to History:\n"
                        + "Title: " + deletedMovie.getTitle() + "\n"
                        + "ID: " + deletedMovie.getId() + "\n\n"
                        + "Use UNDO button to restore it.",
                        "Success",
                        JOptionPane.INFORMATION_MESSAGE);
                return true;
            } else {
                JOptionPane.showMessageDialog(parentFrame, "Delete failed!", "Delete Failed", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        return false;
    }

    public boolean undoDelete(JFrame parentFrame) {
        if (!database.isUndoAvailable()) {
            JOptionPane.showMessageDialog(parentFrame, "No movies to undo!", "Undo Failed", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }

        Movie lastDeleted = database.getLastDeletedMovie();
        if (lastDeleted == null) {
            JOptionPane.showMessageDialog(parentFrame, "No deleted movies found!", "Undo Failed", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        int confirm = JOptionPane.showConfirmDialog(parentFrame,
                "Undo last deletion?\n\n"
                + "Restore movie:\n"
                + "ID: " + lastDeleted.getId() + "\n"
                + "Title: " + lastDeleted.getTitle() + "\n"
                + "Director: " + lastDeleted.getDirector(),
                "Confirm Undo",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (confirm == JOptionPane.YES_OPTION) {
            boolean success = database.undoDelete();

            if (success) {
                JOptionPane.showMessageDialog(parentFrame,
                        "Movie restored successfully!\n\n"
                        + "Title: " + lastDeleted.getTitle() + "\n"
                        + "Has been moved back from History.",
                        "Success",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(parentFrame, "Undo failed!", "Undo Failed", JOptionPane.ERROR_MESSAGE);
            }
            return success;
        }
        return false;
    }

    // ============ GET Data Methods ============
    public ArrayList<Movie> getAllMovies() {
        return database.getAllMovies();
    }

    public LinkedList<Movie> getDashboardMovies() {
        return database.getDashboardMovies();
    }

    public ArrayList<Movie> getHistory() {
        return database.getHistory();
    }

    public void clearHistory(JFrame parentFrame) {
        int confirm = JOptionPane.showConfirmDialog(parentFrame,
                "Are you sure you want to delete ALL history?\n\n"
                + "This will permanently remove all deleted movies from history.\n"
                + "This action CANNOT be undone!",
                "Confirm Clear History",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE);

        if (confirm == JOptionPane.YES_OPTION) {
            database.clearHistory();
            JOptionPane.showMessageDialog(parentFrame,
                    "History cleared successfully!\n\n"
                    + "All deleted movies have been permanently removed.",
                    "Success",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public Movie getMovieById(int id) {
        return database.getMovieById(id);
    }

    public int getTotalMovies() {
        return database.getTotalMovies();
    }

    public int getTotalHistory() {
        return database.getTotalHistory();
    }

    // ============ SEARCH Methods ============
    // Linear Search for Genre (partial matches)
    public ArrayList<Movie> searchByGenre(String genre) {
        ArrayList<Movie> results = new ArrayList<>();
        ArrayList<Movie> allMovies = database.getAllMovies();

        if (genre == null || genre.trim().isEmpty()) {
            return results;
        }

        String searchGenre = genre.trim().toLowerCase();

        for (Movie movie : allMovies) {
            if (movie.getGenre().toLowerCase().contains(searchGenre)) {
                results.add(movie);
            }
        }

        return results;
    }

    // Binary Search for Movie Name (exact match - requires sorted list)
    public Movie binarySearchByTitle(String title) {
        ArrayList<Movie> movies = database.getAllMovies();

        // First, sort by title for binary search
        movies = insertionSortByTitle(movies);

        int left = 0;
        int right = movies.size() - 1;
        String searchTitle = title.trim().toLowerCase();

        while (left <= right) {
            int mid = left + (right - left) / 2;
            String midTitle = movies.get(mid).getTitle().toLowerCase();

            int comparison = searchTitle.compareTo(midTitle);

            if (comparison == 0) {
                return movies.get(mid); // Found exact match
            } else if (comparison < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return null; // Not found
    }

    // ============ SORT Methods ============
    // Selection Sort by Year (Numeric - Ascending)
    public ArrayList<Movie> selectionSortByYear(ArrayList<Movie> movies) {
        if (movies == null || movies.size() <= 1) {
            return new ArrayList<>(movies);
        }

        ArrayList<Movie> sorted = new ArrayList<>(movies);

        for (int i = 0; i < sorted.size() - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < sorted.size(); j++) {
                if (sorted.get(j).getYear() < sorted.get(minIndex).getYear()) {
                    minIndex = j;
                }
            }

            // Swap
            if (minIndex != i) {
                Movie temp = sorted.get(i);
                sorted.set(i, sorted.get(minIndex));
                sorted.set(minIndex, temp);
            }
        }

        return sorted;
    }

    // Insertion Sort by Movie Name (Alphabetical - Ascending)
    public ArrayList<Movie> insertionSortByTitle(ArrayList<Movie> movies) {
        if (movies == null || movies.size() <= 1) {
            return new ArrayList<>(movies);
        }

        ArrayList<Movie> sorted = new ArrayList<>(movies);

        for (int i = 1; i < sorted.size(); i++) {
            Movie key = sorted.get(i);
            String keyTitle = key.getTitle().toLowerCase();
            int j = i - 1;

            while (j >= 0 && sorted.get(j).getTitle().toLowerCase().compareTo(keyTitle) > 0) {
                sorted.set(j + 1, sorted.get(j));
                j = j - 1;
            }
            sorted.set(j + 1, key);
        }

        return sorted;
    }

    // Merge Sort by Rating (Numeric - Descending)
    public ArrayList<Movie> mergeSortByRating(ArrayList<Movie> movies) {
        if (movies == null || movies.size() <= 1) {
            return new ArrayList<>(movies);
        }

        return mergeSortByRatingHelper(new ArrayList<>(movies), 0, movies.size() - 1);
    }

    private ArrayList<Movie> mergeSortByRatingHelper(ArrayList<Movie> movies, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSortByRatingHelper(movies, left, mid);
            mergeSortByRatingHelper(movies, mid + 1, right);

            mergeByRating(movies, left, mid, right);
        }
        return movies;
    }

    private void mergeByRating(ArrayList<Movie> movies, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        ArrayList<Movie> leftArr = new ArrayList<>();
        ArrayList<Movie> rightArr = new ArrayList<>();

        for (int i = 0; i < n1; i++) {
            leftArr.add(movies.get(left + i));
        }
        for (int j = 0; j < n2; j++) {
            rightArr.add(movies.get(mid + 1 + j));
        }

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            // Sort in descending order (higher rating first)
            if (leftArr.get(i).getRating() >= rightArr.get(j).getRating()) {
                movies.set(k, leftArr.get(i));
                i++;
            } else {
                movies.set(k, rightArr.get(j));
                j++;
            }
            k++;
        }

        while (i < n1) {
            movies.set(k, leftArr.get(i));
            i++;
            k++;
        }

        while (j < n2) {
            movies.set(k, rightArr.get(j));
            j++;
            k++;
        }
    }

    // ============ UTILITY Methods ============
    public boolean validateMovieId(String idText, JFrame parentFrame) {
        if (idText == null || idText.trim().isEmpty()) {
            JOptionPane.showMessageDialog(parentFrame, "Please enter Movie ID!", "Empty ID", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        try {
            int id = Integer.parseInt(idText.trim());
            if (id < 0) {
                JOptionPane.showMessageDialog(parentFrame, "Movie ID cannot be negative!", "Invalid ID", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(parentFrame, "Movie ID must be a number!", "Invalid ID", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}
