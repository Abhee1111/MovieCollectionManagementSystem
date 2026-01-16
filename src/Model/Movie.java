package Model;

/**
 * Model class representing a Movie entity.
 * Stores all essential information about a movie including ID, title, director,
 * year of release, genre, and user rating.
 * 
 * @author giria
 */
public class Movie {
    private int id;
    private String title;
    private String director;
    private int year;
    private String genre;
    private int rating;
    
    /**
     * Constructs a new Movie object with all required attributes.
     * 
     * @param id Unique identifier for the movie (must be non-negative)
     * @param title Name of the movie (cannot be empty)
     * @param director Name of the movie director (cannot be empty)
     * @param year Year of release (must be between 1900-2025)
     * @param genre Genre category of the movie
     * @param rating User rating (1-5 scale)
     */
    public Movie(int id, String title, String director, int year, String genre, int rating) {
        this.id = id;
        this.title = title;
        this.director = director;
        this.year = year;
        this.genre = genre;
        this.rating = rating;
    }
    
    /**
     * Gets the unique identifier of the movie.
     * 
     * @return The movie ID
     */
    public int getId() {
        return id;
    }
    
    /**
     * Sets the unique identifier of the movie.
     * 
     * @param id The new movie ID
     */
    public void setId(int id) {
        this.id = id;
    }
    
    // Add similar comments for all other getters and setters
    
    /**
     * Gets the title of the movie.
     * 
     * @return The movie title
     */
    public String getTitle() {
        return title;
    }
    
    /**
     * Sets the title of the movie.
     * 
     * @param title The new movie title
     */
    public void setTitle(String title) {
        this.title = title;
    }
    
    /**
     * Gets the director of the movie.
     * 
     * @return The director name
     */
    public String getDirector() {
        return director;
    }
    
    /**
     * Sets the director of the movie.
     * 
     * @param director The new director name
     */
    public void setDirector(String director) {
        this.director = director;
    }
    
    /**
     * Gets the year of release.
     * 
     * @return The release year
     */
    public int getYear() {
        return year;
    }
    
    /**
     * Sets the year of release.
     * 
     * @param year The new release year
     */
    public void setYear(int year) {
        this.year = year;
    }
    
    /**
     * Gets the genre of the movie.
     * 
     * @return The movie genre
     */
    public String getGenre() {
        return genre;
    }
    
    /**
     * Sets the genre of the movie.
     * 
     * @param genre The new genre
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    /**
     * Gets the user rating of the movie.
     * 
     * @return The rating (1-5)
     */
    public int getRating() {
        return rating;
    }
    
    /**
     * Sets the user rating of the movie.
     * 
     * @param rating The new rating (must be between 1-5)
     */
    public void setRating(int rating) {
        this.rating = rating;
    }
}