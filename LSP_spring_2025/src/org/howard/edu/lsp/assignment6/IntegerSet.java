/**
 * *Name: Inioluwa Ayo-Lawal
 */
package org.howard.edu.lsp.assignment6;


import java.util.ArrayList;
import java.util.List;


/**
 * The IntegerSet class represents a collection of unique integers. It provides common set operations
 * like adding, removing, and checking for elements, as well as performing set operations such as union, 
 * intersection, and difference.
 */
public class IntegerSet {
	// Store the set elements in an ArrayList.
	private List<Integer> set = new ArrayList<Integer>();

	// Default Constructor
	/**
     * Creates an empty IntegerSet.
     * The set starts out empty and can have elements added later.
     */
	public IntegerSet() {
	}

	
	/**
     * Creates an IntegerSet initialized with a list of integers.
     * 
     * @param set a list of integers to initialize the set with.
     */
	public IntegerSet(ArrayList<Integer> set) {
		this.set = set;
	}

    /**
     * Clears the set, removing all the elements inside it.
     * After calling this, the set will be empty.
     */
	public void clear() {
		set.clear();
	};

	// Returns the length of the set. 5 pts.
    /**
     * Returns the number of elements in the set.
     * 
     * @return the number of elements currently in the set.
     */
	public int length() {
		return set.size();
	}; // returns the length



    /**
     * Checks if this set is equal to another set. Two sets are considered equal if they contain the same
     * elements, regardless of the order.
     *
     * @param o the object to compare this set to.
     * @return true if the sets are equal, false otherwise.
     */
    @Override
	public boolean equals(Object o) {
		if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntegerSet other = (IntegerSet) o;
        return set.equals(other.set);
	}; 


    /**
     * Checks if the set contains the specified value.
     * 
     * @param value the value to check for in the set.
     * @return true if the set contains the value, false otherwise.
     */
	public boolean contains(int value) {
		return set.contains(value);
	};    
			
			
	/**
     * Finds and returns the largest element in the set.
     * Throws an exception if the set is empty.
     * 
     * @return the largest value in the set.
     * @throws IllegalArgumentException if the set is empty.
     */
	public int largest()  {
		if (set.isEmpty()) throw new IllegalArgumentException("Set is empty");
        return set.stream().max(Integer::compareTo).get();
	}; 

	
	

    /**
     * Finds and returns the smallest element in the set.
     * Throws an exception if the set is empty.
     * 
     * @return the smallest value in the set.
     * @throws IllegalArgumentException if the set is empty.
     */
	public int smallest()  {
		if (set.isEmpty()) throw new IllegalArgumentException("Set is empty");
        return set.stream().min(Integer::compareTo).get();
	};

		
	
    /**
     * Adds an element to the set if it's not already there.
     * Duplicates are not allowed, so if the element is already present, nothing changes.
     * 
     * @param item the integer to add to the set.
     */
	 	public void add(int item) {
	 		if (!set.contains(item)) {
	            set.add(item);
	        }
	 	}; // adds item to the set or does nothing if it is in set

	 	/**
	     * Removes an element from the set. If the element isn't in the set, nothing happens.
	     * 
	     * @param item the integer to remove from the set.
	     */
	public void remove(int item) {
		set.remove(Integer.valueOf(item));
	}; 

    /**
     * Adds all the elements from another set that are not already in this set.
     * The union of two sets combines all unique elements from both sets.
     * 
     * @param intSetb the other IntegerSet to unite with this one.
     */
	public void union(IntegerSet intSetb) {
		for (int item : intSetb.set) {
            if (!set.contains(item)) {
                set.add(item);
            }
        }
	};

    /**
     * Updates the set to keep only the elements that are present in both this set and another set.
     * The result is the intersection of the two sets.
     * 
     * @param intSetb the other IntegerSet to intersect with this one.
     */
	public void intersect(IntegerSet intSetb) {
		set.retainAll(intSetb.set);
	}; 

    /**
     * Removes all elements from this set that are also in another set.
     * The result is the difference between the two sets (this set minus the other set).
     * 
     * @param intSetb the other IntegerSet to subtract from this one.
     */
	public void diff(IntegerSet intSetb) {
		set.removeAll(intSetb.set);
	}; // set difference, i.e. s1 - s2

    /**
     * Updates this set to contain only elements that are in the other set but not in this set.
     * Essentially, it takes the complement of the current set based on the other set.
     * 
     * @param intSetb the other IntegerSet to compare against.
     */
	public void complement(IntegerSet intSetb) {
		List<Integer> tempSet = new ArrayList<>(intSetb.set);
	    tempSet.removeAll(set);
	    set.clear();
	    set.addAll(tempSet);
	}

    /**
     * Checks if the set is empty.
     * 
     * @return true if the set is empty, false otherwise.
     */
	boolean isEmpty() {
		return set.isEmpty();
	}; 

    /**
     * Returns a string representation of the set. This method returns a string that shows the elements in
     * the set in a readable format.
     * 
     * @return a string representing the set.
     */
    @Override
	public String toString() {
		return "Set: " + set.toString();
	};	// return String representation of your set



}
