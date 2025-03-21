package org.howard.edu.lsp.midterm.question5;
/**
 * Represents an audiobook media type that supports common playback controls
 * and audiobook-specific features like playback speed adjustment.
 */
public class Audiobook {
	 private String title;

	    // Constructor to set movie title
	    public Audiobook(String title) {
	        this.title = title;
	    }
	    
	    // Play Audiobook
	    public void play() {
	        System.out.println("Playing Audiobook: " + title);
	    }

	    // Pause Audiobook
	    public void pause() {
	        System.out.println("Paused Audiobook: " + title);
	    }

	    // Stop Audiobook
	    public void stop() {
	        System.out.println("Stopped Audiobook: " + title);
	    }
	    
	    
	    // Audiobook-specific feature: set playback speed
	    public void setPlaybackSpeed(double speed) {
	        System.out.println("Setting playback speed of audiobook: " + title + " to " + speed + "x");
	    }
}
