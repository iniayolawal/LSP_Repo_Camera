/*
 * Inioluwa Ayo-Lawal
 * 
 * 
 * References:
 * https://junit.org/junit5/docs/current/user-guide/#writing-tests-assertions
 * https://www.baeldung.com/junit-5
 * https://stackoverflow.com/questions/5889239/why-should-i-use-a-delta-when-comparing-floating-point-numbers
 * */
package org.howard.edu.lspfinal.question1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * This test class verifies the functionality of the {@link ShoppingCart} class.
 * 
 * It contains a series of unit tests designed to confirm that the core operations of
 * the shopping cart—such as adding items, calculating totals, applying discounts,
 * and handling invalid inputs—work correctly under a variety of conditions.
 *
 * Each test is annotated with @DisplayName for clear identification when tests are run.
 */
public class ShoppingCartTest {

	/**
     * Tests whether a valid item with a positive price is successfully added to the cart.
     * Verifies that the total cost reflects the price of the added item.
     */
    @Test
    @DisplayName("Test adding valid item")
    public void testAddValidItem() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Apple", 1.99);
        assertEquals(1.99, cart.getTotalCost(), 0.01);
	}
	
    /**
     * Tests the system’s behavior when attempting to add an item priced at zero.
     * Since zero is not allowed, the test checks that an IllegalArgumentException is thrown.
     */
    @Test
    @DisplayName("Test adding item with 0 price (expect exception)")
    public void testAddItemZeroPrice() {
        ShoppingCart cart = new ShoppingCart();
        assertThrows(IllegalArgumentException.class, () -> cart.addItem("FreeItem", 0));
    }
	
    
    /**
     * Ensures that the shopping cart rejects items with negative prices.
     * The cart should raise an IllegalArgumentException when such input is provided.
     */

	@Test
	@DisplayName("Test adding item with negative price (expect exception)")
	public void testAddItemNegativePrice() {
		ShoppingCart cart = new ShoppingCart();
		assertThrows(IllegalArgumentException.class, () -> cart.addItem("Banana", -1.00));
		
	}
	
	/**
     * Tests that removing an item which exists in the cart successfully deletes it,
     * and the total cost is updated accordingly.
     */
	@Test
	@DisplayName("Test removing existing item")
	public void testRemoveExistingItem() {
	    ShoppingCart cart = new ShoppingCart();
	    cart.addItem("Milk", 2.50);
	    cart.removeItem("Milk");
	    assertEquals(0.0, cart.getTotalCost(), 0.01);
	}

	 /**
     * Tests that removing a non-existent item does not cause an error,
     * and the cart remains unchanged.
     */
	@Test
	@DisplayName("Test removing non-existent item")
	public void testRemoveNonExistentItem() {
	    ShoppingCart cart = new ShoppingCart();
	    cart.addItem("Bread", 3.00);
	    cart.removeItem("Cheese");  // not in cart
	    assertEquals(3.00, cart.getTotalCost(), 0.01);  // cost should be unaffected
	}
	
	/**
     * Verifies that applying the "SAVE10" discount code correctly applies a 10% discount
     * and updates the internal discount percentage.
     */
	@Test
	@DisplayName("Test applying SAVE10")
	public void testApplySave10() {
		ShoppingCart cart = new ShoppingCart();
		cart.applyDiscountCode("SAVE10");
		assertEquals(10.0, cart.getDiscountPercentage(), 0.01);
		
	}
	
	/**
     * Verifies that applying the "SAVE20" discount code correctly applies a 20% discount.
     * This test ensures that the system recognizes the discount and adjusts calculations accordingly.
     */
	@Test
	@DisplayName("Test applying SAVE20")
	public void testApplySave20() {
		ShoppingCart cart = new ShoppingCart();
		cart.applyDiscountCode("SAVE20");
		assertEquals(20.0, cart.getDiscountPercentage(), 0.01);
	}
	
	/**
     * Tests the system’s response to an invalid discount code.
     * The cart should throw an exception when a code other than "SAVE10" or "SAVE20" is applied.
     */
	@Test
	@DisplayName("Test applying invalid discount code (expect exception)")
	public void TestApplyInvalidCode() {
		ShoppingCart cart = new ShoppingCart();
		assertThrows(IllegalArgumentException.class, () -> cart.applyDiscountCode("SAVE50"));
	}
	
	/**
     * Verifies that the cart calculates the correct total cost when no discounts are applied.
     * It sums up all item prices and returns the correct amount.
     */

	@Test
	@DisplayName("Test total cost without discount")
	public void testTotalCostNoDiscount() {
		ShoppingCart cart = new ShoppingCart();
		cart.addItem("Milk", 2.50);
		cart.addItem("Bread", 3.50);
		assertEquals(6.0, cart.getTotalCost(), 0.01);
	}
	
	 /**
     * Confirms that the cart correctly calculates the total after applying a 10% discount.
     * The test first adds multiple items, applies a discount code, and checks the final total.
     */
	@Test
	@DisplayName("Test total cost with discount")
	public void testTotalCostWithDiscount() {
		ShoppingCart cart = new ShoppingCart();
		cart.addItem("Milk", 2.50);
		cart.addItem("Bread", 3.50);
		cart.applyDiscountCode("SAVE10");
		assertEquals(5.4, cart.getTotalCost(), 0.01);
	}
	
	
	/**
     * Ensures that when no items have been added to the cart,
     * the total cost returned is 0.0, regardless of any applied discounts.
     */
	@Test
	@DisplayName("Test total cost with empty cart")
	public void testTotalCostEmptyCart() {
		ShoppingCart cart = new ShoppingCart();
		assertEquals(0.0, cart.getTotalCost(), 0.01);
	}
}
