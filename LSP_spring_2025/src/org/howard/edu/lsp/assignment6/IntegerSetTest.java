/**
 * *Name: Inioluwa Ayo-Lawal
 */
package org.howard.edu.lsp.assignment6;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
/**
 * References
 * https://junit.org/junit5/docs/current/user-guide/
 * https://youtu.be/6uSnF6IuWIw?si=No3brq0bK11yx_jI
 */

public class IntegerSetTest {

	// Test for largest() method with exception handling
    @Test
    @DisplayName("Test case for largest() - valid")
    public void testLargest() throws IntegerSetException {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(2);
        set.add(3);
        
        assertEquals(3, set.largest(), "Largest element should be 3");
    }

    @Test
    @DisplayName("Test case for largest() - exception on empty set")
    public void testLargestEmpty() {
        IntegerSet set = new IntegerSet();
        assertThrows(IntegerSetException.class, () -> set.largest(), "Exception should be thrown for empty set");
    }

    // Test for smallest() method with exception handling
    @Test
    @DisplayName("Test case for smallest() - valid")
    public void testSmallest() throws IntegerSetException {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(2);
        set.add(3);
        
        assertEquals(1, set.smallest(), "Smallest element should be 1");
    }

    @Test
    @DisplayName("Test case for smallest() - exception on empty set")
    public void testSmallestEmpty() {
        IntegerSet set = new IntegerSet();
        assertThrows(IntegerSetException.class, () -> set.smallest(), "Exception should be thrown for empty set");
    }

    // Test for add() method
    @Test
    @DisplayName("Test case for add()")
    public void testAdd() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(1);  // Duplicate, should not add it again
        set.add(2);
        
        assertEquals(2, set.length(), "Length should be 2 as duplicates are not allowed");
        assertTrue(set.contains(1), "Set should contain 1");
        assertTrue(set.contains(2), "Set should contain 2");
    }

    // Test for remove() method
    @Test
    @DisplayName("Test case for remove()")
    public void testRemove() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(2);
        set.remove(1);
        
        assertFalse(set.contains(1), "Set should not contain 1 after removing it");
        assertTrue(set.contains(2), "Set should still contain 2");
    }

    // Test for union() method
    @Test
    @DisplayName("Test case for union()")
    public void testUnion() {
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        
        IntegerSet set2 = new IntegerSet();
        set2.add(2);
        set2.add(3);
        
        set1.union(set2);
        
        assertTrue(set1.contains(3), "Union should include all elements from both sets");
        assertEquals(3, set1.length(), "Set1 should now have 3 elements after union");
    }

    // Test for intersect() method
    @Test
    @DisplayName("Test case for intersect()")
    public void testIntersect() {
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        
        IntegerSet set2 = new IntegerSet();
        set2.add(2);
        set2.add(3);
        
        set1.intersect(set2);
        
        assertTrue(set1.contains(2), "Intersection should only include common elements");
        assertEquals(1, set1.length(), "Set1 should now have 1 element after intersection");
    }

    // Test for diff() method
    @Test
    @DisplayName("Test case for diff()")
    public void testDiff() {
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        
        IntegerSet set2 = new IntegerSet();
        set2.add(2);
        
        set1.diff(set2);
        
        assertTrue(set1.contains(1), "Difference should keep elements not in the second set");
        assertFalse(set1.contains(2), "Difference should remove elements found in the second set");
    }

    // Test for complement() method
    @Test
    @DisplayName("Test case for complement()")
    public void testComplement() {
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        
        IntegerSet set2 = new IntegerSet();
        set2.add(2);
        set2.add(3);
        
        set1.complement(set2);
        
        assertTrue(set1.contains(3), "Complement should include elements not in the first set");
        assertEquals(1, set1.length(), "Set1 should now have 1 element after complement");
    }

    // Test for isEmpty() method
    @Test
    @DisplayName("Test case for isEmpty()")
    public void testIsEmpty() {
        IntegerSet set = new IntegerSet();
        assertTrue(set.isEmpty(), "New set should be empty");
        
        set.add(1);
        assertFalse(set.isEmpty(), "Set should not be empty after adding an element");
    }

    // Test for toString() method
    @Test
    @DisplayName("Test case for toString()")
    public void testToString() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(2);
        assertEquals("Set: [1, 2]", set.toString(), "toString should return the correct string representation of the set");
    }
}