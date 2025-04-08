/**
 * *Name: Inioluwa Ayo-Lawal
 */
package org.howard.edu.lsp.assignment6;

public class Driver {

    public static void main(String[] args) throws IntegerSetException {
        // Test 1: Creating IntegerSet and testing add(), toString(), length(), and contains().
        System.out.println("Test 1: Testing add(), toString(), length(), contains()");
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println("Value of Set1: " + set1.toString());  // Should print: Set: [1, 2, 3]
        System.out.println("Length of Set1: " + set1.length());   // Should print: 3
        System.out.println("Does Set1 contain 2? " + set1.contains(2)); // Should print: true
        System.out.println("Does Set1 contain 4? " + set1.contains(4)); // Should print: false
        System.out.println();

        // Test 2: Testing smallest() and largest() methods
        System.out.println("Test 2: Testing smallest() and largest()");
        System.out.println("Smallest value in Set1: " + set1.smallest()); // Should print: 1
        System.out.println("Largest value in Set1: " + set1.largest());   // Should print: 3
        System.out.println();

        // Test 3: Testing remove() method
        System.out.println("Test 3: Testing remove()");
        set1.remove(2);  // Removes 2 from the set
        System.out.println("Value of Set1 after removing 2: " + set1.toString());  // Should print: Set: [1, 3]
        set1.remove(4);  // Try removing an element not in the set (no effect)
        System.out.println("Value of Set1 after trying to remove 4: " + set1.toString());  // Should still print: Set: [1, 3]
        System.out.println();

        // Test 4: Testing clear() method
        System.out.println("Test 4: Testing clear()");
        set1.clear();  // Clears the set
        System.out.println("Value of Set1 after clearing: " + set1.toString());  // Should print: Set: []
        System.out.println();

        // Test 5: Testing equals() method
        System.out.println("Test 5: Testing equals()");
        IntegerSet set2 = new IntegerSet();
        set2.add(1);
        set2.add(3);
        IntegerSet set3 = new IntegerSet();
        set3.add(1);
        set3.add(2);
        set3.add(3);
        System.out.println("Is Set1 equal to Set2? " + set1.equals(set2));  // Should print: true
        System.out.println("Is Set1 equal to Set3? " + set1.equals(set3));  // Should print: false
        System.out.println();

        // Test 6: Testing union() method
        System.out.println("Test 6: Testing union()");
        set1.add(1);
        set1.add(2);
        set1.add(3);
        IntegerSet set4 = new IntegerSet();
        set4.add(3);
        set4.add(4);
        set4.add(5);
        System.out.println("Value of Set1 before union: " + set1.toString());  // Should print: Set: [1, 2, 3]
        System.out.println("Value of Set4 before union: " + set4.toString());  // Should print: Set: [3, 4, 5]
        set1.union(set4);  // Set1 should now contain [1, 2, 3, 4, 5]
        System.out.println("Result of union of Set1 and Set4: " + set1.toString());  // Should print: Set: [1, 2, 3, 4, 5]
        System.out.println();

        // Test 7: Testing intersect() method
        System.out.println("Test 7: Testing intersect()");
        set1.add(6);
        System.out.println("Value of Set1 before intersection: " + set1.toString());  // Should print: Set: [1, 2, 3, 4, 5, 6]
        set1.intersect(set4);  // Intersection of Set1 and Set4 should be [3, 4, 5]
        System.out.println("Result of intersection of Set1 and Set4: " + set1.toString());  // Should print: Set: [3, 4, 5]
        System.out.println();

        // Test 8: Testing diff() method (Set1 - Set4)
        System.out.println("Test 8: Testing diff()");
        set1.diff(set4);  // Set1 should now be [3, 4, 5] - [3, 4, 5] => []
        System.out.println("Result of diff (Set1 - Set4): " + set1.toString());  // Should print: Set: []

        // Test 9: Testing complement() method
        System.out.println("Test 9: Testing complement()");
        IntegerSet set5 = new IntegerSet();
        set5.add(7);
        set5.add(8);
        set5.add(9);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        System.out.println("Value of Set1 before complement: " + set1.toString());  // Should print: Set: [3, 4, 5]
        System.out.println("Value of Set5 before complement: " + set5.toString());  // Should print: Set: [7, 8, 9]
        set1.complement(set5);  // Set1 should now contain [7, 8, 9]
        System.out.println("Result of complement of Set1 and Set5: " + set1.toString());  // Should print: Set: [7, 8, 9]
        System.out.println();

        // Test 10: Testing isEmpty() method
        System.out.println("Test 10: Testing isEmpty()");
        System.out.println("Is Set1 empty? " + set1.isEmpty());  // Should print: false
        set1.clear();
        System.out.println("Is Set1 empty after clearing? " + set1.isEmpty());  // Should print: true
        System.out.println();
    }
}
