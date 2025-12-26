/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Model;

/**
 *
 * @author giria
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class MovieDatabase {
    private static MovieDatabase instance = null;
    
    public static MovieDatabase getInstance() {
        if (instance == null) {
            instance = new MovieDatabase();
        }
        return instance;
    }
    
    private ArrayList<Movie> allMovies;
    
    private LinkedList<Movie> dashboardMovies;
    
    private Queue<Movie> historyQueue;
    
    private MovieDatabase() {
        allMovies = new ArrayList<>();
        dashboardMovies = new LinkedList<>();
        historyQueue = new LinkedList<>();
        
        loadDummyData();
    }
    
    private void loadDummyData() {
        Movie m1 = new Movie(1, "Titanic", "Frank", 1994, "Drama", 5);
        Movie m2 = new Movie(2, "Godfather", "Francis", 1972, "Drama", 5);
        Movie m3 = new Movie(3, "Dark Knight", "Christopher", 2008, "Action", 5);
        Movie m4 = new Movie(4, "Pulp Fiction", "Quentin", 1994, "Drama", 4);
        Movie m5 = new Movie(5, "Inception", "Nolan", 2010, "Action", 5);
        
        allMovies.add(m1);
        allMovies.add(m2);
        allMovies.add(m3);
        allMovies.add(m4);
        allMovies.add(m5);
        
        dashboardMovies.add(m1);
        dashboardMovies.add(m2);
        dashboardMovies.add(m3);
        dashboardMovies.add(m4);
        dashboardMovies.add(m5);
    }
    
    public boolean isIdExists(int id) {
        for (Movie movie : allMovies) {
            if (movie.getId() == id) {
                return true;
            }
        }
        return false;
    }
    
    public Movie addMovie(int id, String title, String director, int year, String genre, int rating) {
        Movie newMovie = new Movie(id, title, director, year, genre, rating);
        
        allMovies.add(newMovie);
        
        dashboardMovies.addFirst(newMovie);
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
        dashboardMovies.clear();
        int count = 0;
        for (int i = allMovies.size() - 1; i >= 0 && count < 5; i--) {
            dashboardMovies.add(allMovies.get(i));
            count++;
        }
    }
    
    public Movie deleteMovie(int id) {
        for (Movie movie : allMovies) {
            if (movie.getId() == id) {
                allMovies.remove(movie);
                historyQueue.offer(movie);
                
                updateDashboard();
                
                return movie;
            }
        }
        return null;
    }
    
    public Movie deleteFromHistory(int id) {
        Movie toRemove = null;
        for (Movie movie : historyQueue) {
            if (movie.getId() == id) {
                toRemove = movie;
                break;
            }
        }
        
        if (toRemove != null) {
            historyQueue.remove(toRemove);
            return toRemove;
        }
        return null;
    }

    public ArrayList<Movie> getAllMovies() {
        return new ArrayList<>(allMovies);
    }
    
    public ArrayList<Movie> getDashboardMovies() {
        return new ArrayList<>(dashboardMovies);
    }
    
    public ArrayList<Movie> getHistory() {
        return new ArrayList<>(historyQueue);
    }
    
    public void clearHistory() {
        historyQueue.clear();
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
}