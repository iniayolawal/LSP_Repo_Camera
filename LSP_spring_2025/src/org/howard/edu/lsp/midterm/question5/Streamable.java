package org.howard.edu.lsp.midterm.question5;
/**
 * Represents shared behaviors for all types of media content.
 * Any class that implements this interface must provide implementations for
 * play, pause, and stop actions.
 * 
 * References:
 * https://www.geeksforgeeks.org/interfaces-in-java/
 * https://www.w3schools.com/java/java_interface.asp
 */
public interface Streamable {
    void play();
    void pause();
    void stop();
}
