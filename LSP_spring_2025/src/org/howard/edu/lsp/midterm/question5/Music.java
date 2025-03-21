package org.howard.edu.lsp.midterm.question5;
/**
 * Represents a music media type that supports common playback controls
 * and music-specific features like adding to a playlist.
 */
public class Music implements Streamable{
	
	private String title;
	
	// Constructor to set music title
    public Music(String title) {
        this.title = title;
    }
	
    // Play music
    public void play() {
        System.out.println("Playing music: " + title);
    }
	
    // Pause music
    public void pause() {
        System.out.println("Paused music: " + title);
    }

 // Stop music
    public void stop() {
        System.out.println("Stopped music: " + title);
    }
    // this is a mussic-specific feature: add to playlist
    public void addToPlaylist(String playlistName) {
        System.out.println("Added " + title + " to " + playlistName + " playlist");
    }


}
