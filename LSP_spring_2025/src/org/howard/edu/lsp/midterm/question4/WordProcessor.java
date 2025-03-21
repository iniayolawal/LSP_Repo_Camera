package org.howard.edu.lsp.midterm.question4;


import java.util.ArrayList;
import java.util.List;

/**
 * This class processes a sentence and finds the longest words in it. 
 * It makes sure to handle extra spaces between words and works with 
 * both short and long sentences.
 * 
 * 
 * References:
 * https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#split-java.lang.String-
 * https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#trim--
 * https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#length--
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
