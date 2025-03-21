package org.howard.edu.lsp.midterm.question5;
/**
 * Represents a movie media type that supports common playback controls
 * and movie-specific features like rewinding.
 */
public class Movie {
	 private String title;

	    // Constructor to set movie title
	    public Movie(String title) {
	        this.title = title;
	    }
	    
	    // Play movie
	    public void play() {
	        System.out.println("Playing movie: " + title);
	    }

	    // Pause movie
	    public void pause() {
	        System.out.println("Paused movie: " + title);
	    }

	    // Stop movie
	    public void stop() {
	        System.out.println("Stopped movie: " + title);
	    }
	    
	    // Movie-specific feature: rewind
	    public void rewind(int seconds) {
	        System.out.println("Rewinding movie: " + title + " by " + seconds + " seconds");
	    }
}
