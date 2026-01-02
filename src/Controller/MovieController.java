/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author giria
 */

import Model.Movie;
import Model.MovieDatabase;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class MovieController {
    private MovieDatabase database;
    
    public MovieController() {
        database = MovieDatabase.getInstance();
    }
    
    public boolean addMovie(int id, String title, String director, int year, String genre, int rating, JFrame parentFrame) {
        if (id < 0) {
            JOptionPane.showMessageDialog(parentFrame, "Movie id cannot be less than 0!", "Validation Error", JOptionPane.ERROR_MESSAGE);
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
        
        JOptionPane.showMessageDialog(parentFrame, "Movie added successfully!\n\n" +"ID: " + newMovie.getId() + "\n" +"Title: " + newMovie.getTitle(), "Success", JOptionPane.INFORMATION_MESSAGE);
        return true;
    }
    
    public boolean updateMovie(int id, String title, String director, int year, String genre, int rating, JFrame parentFrame) {       
        if (title == null || title.trim().isEmpty()) {
            JOptionPane.showMessageDialog(parentFrame, "Movie name cannot be empty!", "Validation Error", JOptionPane.ERROR_MESSAGE);
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
                
        boolean success = database.updateMovie(id, title, director, year, genre, rating);
        
        if (success) {
            JOptionPane.showMessageDialog(parentFrame, "Movie updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(parentFrame, "Movie not found!", "Update Failed", JOptionPane.ERROR_MESSAGE);
        } 
        return success;
    }
    
    public boolean deleteMovie(int id, JFrame parentFrame) {
        Movie deletedMovie = database.deleteMovie(id);
        
        if (deletedMovie != null) {
            JOptionPane.showMessageDialog(parentFrame, "Movie deleted successfully!\n\n" + "Moved to History:\n" +deletedMovie.getTitle(), "Success", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } else {
            JOptionPane.showMessageDialog(parentFrame, "Movie not found!", "Delete Failed", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public ArrayList<Movie> getAllMovies() {
        return database.getAllMovies();
    }
    
   
    
    public ArrayList<Movie> getHistory() {
        return database.getHistory();
    }
    
    public void clearHistory(JFrame parentFrame) {
        int confirm = JOptionPane.showConfirmDialog(parentFrame, "Are you sure you want to delete all history?\n", "Confirm Delete", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        
        if (confirm == JOptionPane.YES_OPTION) {
            database.clearHistory();
            
            JOptionPane.showMessageDialog(parentFrame,"History cleared successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);}
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

}
