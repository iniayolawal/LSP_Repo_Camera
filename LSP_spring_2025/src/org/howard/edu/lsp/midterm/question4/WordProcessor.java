package org.howard.edu.lsp.midterm.question4;


import java.util.ArrayList;
import java.util.List;

/**
 * A utility class that processes a given sentence and returns all the longest words.
 * It handles different spacing between words and ensures accurate word extraction.
 * 
 * References:
 * https://www.geeksforgeeks.org/java-string-split-method/
 * https://www.geeksforgeeks.org/java-util-arraylist-in-java/
 * https://www.w3schools.com/java/ref_string.asp
 * https://www.w3schools.com/java/java_arraylist.asp
 */
public class WordProcessor {
	private String sentence; // Stores the sentence to be processed

    // Constructor to initialize the sentence
    public WordProcessor(String sentence) {
        this.sentence = sentence;
    }
    
    // Method to find all longest words in the given sentence
    public List<String> findLongestWords() {
        if (sentence == null || sentence.trim().isEmpty()) return new ArrayList<>(); // Return empty list if input is empty

        String[] words = sentence.trim().split("\\s+"); // Splitting words using regex to handle multiple spaces
        int maxLength = 0; // Stores length of longest words
        List<String> longestWords = new ArrayList<>(); // List to store longest words
        
     // Loop through words to find the longest ones
        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length(); // Update max length
                longestWords.clear(); // Reset list since new longest word is found
                longestWords.add(word);
            } else if (word.length() == maxLength) {
                longestWords.add(word); // Add word if it matches max length
            }
        }
        return longestWords;
    }
}
