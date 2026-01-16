/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Model;

import java.util.ArrayList;

public class MovieDatabase {
    private static MovieDatabase instance = null;
    
    public static MovieDatabase getInstance() {
        if (instance == null) {
            instance = new MovieDatabase();
        }
        return instance;
    }
    
    // ============ MANUAL DATA STRUCTURE IMPLEMENTATIONS ============
    
    // ArrayList for storing all movies (allowed to use built-in ArrayList)
    private ArrayList<Movie> allMovies;
    
    // MANUAL LinkedList for dashboard (5 most recent movies)
    private ManualLinkedList dashboardMovies;
    
    // MANUAL Queue for history (deleted movies)
    private ManualQueue historyQueue;
    
    // MANUAL Stack for undo (only for deleted movies)
    private ManualStack undoStack;
    
    // ============ MANUAL LINKED LIST IMPLEMENTATION ============
    private class ManualLinkedList {
        private Node head;
        private Node tail;
        private int size;
        private final int MAX_SIZE = 5;
        
        private class Node {
            Movie movie;
            Node next;
            Node prev;
            
            Node(Movie movie) {
                this.movie = movie;
            }
        }
        
        ManualLinkedList() {
            head = null;
            tail = null;
            size = 0;
        }
        
        // Manual addFirst - add to beginning
        void addFirst(Movie movie) {
            Node newNode = new Node(movie);
            
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
            size++;
            
            // Keep only 5 movies in dashboard
            if (size > MAX_SIZE) {
                removeLast();
            }
        }
        
        // Manual removeLast - remove from end
        void removeLast() {
            if (tail == null) return;
            
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                Node secondLast = tail.prev;
                secondLast.next = null;
                tail = secondLast;
            }
            size--;
        }
        
        boolean isEmpty() {
            return head == null;
        }
        
        int size() {
            return size;
        }
        
        ArrayList<Movie> toArrayList() {
            ArrayList<Movie> list = new ArrayList<>();
            Node current = head;
            while (current != null) {
                list.add(current.movie);
                current = current.next;
            }
            return list;
        }
        
        void clear() {
            head = null;
            tail = null;
            size = 0;
        }
    }
    
    // ============ MANUAL QUEUE IMPLEMENTATION ============
    private class ManualQueue {
        private Node front;
        private Node rear;
        private int size;
        
        private class Node {
            Movie movie;
            Node next;
            
            Node(Movie movie) {
                this.movie = movie;
            }
        }
        
        ManualQueue() {
            front = null;
            rear = null;
            size = 0;
        }
        
        // Manual enqueue - add to rear
        void enqueue(Movie movie) {
            Node newNode = new Node(movie);
            
            if (rear == null) {
                front = newNode;
                rear = newNode;
            } else {
                rear.next = newNode;
                rear = newNode;
            }
            size++;
        }
        
        // Manual dequeue - remove from front
        Movie dequeue() {
            if (front == null) return null;
            
            Movie movie = front.movie;
            front = front.next;
            
            if (front == null) {
                rear = null;
            }
            size--;
            return movie;
        }
        
        // Manual remove specific movie
        boolean remove(Movie movie) {
            if (front == null) return false;
            
            // If movie is at front
            if (front.movie.equals(movie)) {
                front = front.next;
                if (front == null) rear = null;
                size--;
                return true;
            }
            
            // Search for movie in queue
            Node current = front;
            while (current.next != null) {
                if (current.next.movie.equals(movie)) {
                    current.next = current.next.next;
                    if (current.next == null) {
                        rear = current;
                    }
                    size--;
                    return true;
                }
                current = current.next;
            }
            return false;
        }
        
        boolean isEmpty() {
            return front == null;
        }
        
        int size() {
            return size;
        }
        
        ArrayList<Movie> toArrayList() {
            ArrayList<Movie> list = new ArrayList<>();
            Node current = front;
            while (current != null) {
                list.add(current.movie);
                current = current.next;
            }
            return list;
        }
        
        void clear() {
            front = null;
            rear = null;
            size = 0;
        }
        
        boolean contains(Movie movie) {
            Node current = front;
            while (current != null) {
                if (current.movie.equals(movie)) {
                    return true;
                }
                current = current.next;
            }
            return false;
        }
    }
    
    // ============ MANUAL STACK IMPLEMENTATION ============
    private class ManualStack {
        private Node top;
        private int size;
        
        private class Node {
            Movie movie;
            Node next;
            
            Node(Movie movie) {
                this.movie = movie;
            }
        }
        
        ManualStack() {
            top = null;
            size = 0;
        }
        
        // Manual push - add to top
        void push(Movie movie) {
            Node newNode = new Node(movie);
            newNode.next = top;
            top = newNode;
            size++;
        }
        
        // Manual pop - remove from top
        Movie pop() {
            if (top == null) return null;
            
            Movie movie = top.movie;
            top = top.next;
            size--;
            return movie;
        }
        
        // Manual peek - view top without removing
        Movie peek() {
            return (top != null) ? top.movie : null;
        }
        
        boolean isEmpty() {
            return top == null;
        }
        
        int size() {
            return size;
        }
        
        void clear() {
            top = null;
            size = 0;
        }
    }
    
    // ============ MOVIEDATABASE CONSTRUCTOR ============
    private MovieDatabase() {
        allMovies = new ArrayList<>();
        dashboardMovies = new ManualLinkedList();
        historyQueue = new ManualQueue();
        undoStack = new ManualStack();
        
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
        
        // Add to dashboard (MANUAL LinkedList)
        dashboardMovies.addFirst(m5); // Most recent
        dashboardMovies.addFirst(m4);
        dashboardMovies.addFirst(m3);
        dashboardMovies.addFirst(m2);
        dashboardMovies.addFirst(m1); // Oldest in dashboard
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
        
        // Add to dashboard (MANUAL LinkedList)
        dashboardMovies.addFirst(newMovie);
        
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
            
            // Add to history Queue (MANUAL enqueue)
            historyQueue.enqueue(movieToDelete);
            
            // Push to undo Stack (MANUAL push)
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
            
            if (movieToRestore != null && historyQueue.contains(movieToRestore)) {
                // Remove from history Queue
                historyQueue.remove(movieToRestore);
                
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
        return undoStack.peek();
    }
    
    public ArrayList<Movie> getAllMovies() {
        return new ArrayList<>(allMovies);
    }
    
    public ArrayList<Movie> getDashboardMovies() {
        return dashboardMovies.toArrayList();
    }
    
    public ArrayList<Movie> getHistory() {
        return historyQueue.toArrayList();
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