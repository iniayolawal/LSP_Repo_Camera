package org.howard.edu.lsp.midterm.question3;


import java.util.HashMap;
import java.util.Map;

/**
 * This class represents a basic voting machine where people can vote for candidates.
 * It keeps track of votes, ensures that votes can only be cast for registered candidates, 
 * prevents voting for non-existent candidates, and determines the winner based on the highest vote count.
 * 
 * 
 * References:
 *  Java hash map https://www.geeksforgeeks.org/java-util-hashmap-in-java/
 *  https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html
 *  https://www.baeldung.com/java-equals-hashcode-contracts
 * 
 */
public class VotingMachine {
	private Map<String, Integer> votes; // Stores candidate names and their vote counts
	// Constructor initializes an empty voting system
    public VotingMachine() {
        votes = new HashMap<>();
    }

    // Adds a candidate to the election if they are not already registered
    public void addCandidate(String name) {
        votes.putIfAbsent(name, 0);
    }

    // Casts a vote for a candidate if they exist in the system
    public boolean castVote(String name) {
        if (votes.containsKey(name)) {
            votes.put(name, votes.get(name) + 1); // Increment candidate's vote count
            return true;
        }
        return false; // Candidate does not exist
    }

    // Determines and returns the winner of the election
    public String getWinner() {
        return votes.entrySet().stream()
                .max(Map.Entry.comparingByValue()) // Find candidate with highest votes
                .map(entry -> entry.getKey() + " WINS with " + entry.getValue() + " votes!!")
                .orElse("No votes cast."); // If no votes, return a default message
    }
}

