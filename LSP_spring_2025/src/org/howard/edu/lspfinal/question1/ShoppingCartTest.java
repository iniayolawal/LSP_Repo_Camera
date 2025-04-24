/*
 * Inioluwa Ayo-Lawal
 * */
package org.howard.edu.lspfinal.question1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ShoppingCartTest {
	@Test
	@DisplayName('Test adding valid item')
	public void testAddValidItem() {
		ShoppingCart cart= new ShoppingCart();
		cart.addItem("Apple", 1.99);
		assertEquals(1.99, cart.getTotalCost(), 0.01);
	}
	
	
	@Test
	@DisplayName("Test adding item with 0 price (expect exception)")
	public void testAddItemZeroPric() {
		ShoppingCart cart = new ShoppingCart();
		assertThrows(IllegaArgumentException.class, () -> cart.addItem("FreeItem", 0));
		
	}
	
	@Test
	@DisplayName("Test adding item with negative price (expect exception)")
	public void testAddItemNegativePrice() {
		ShoppingCart cart = new ShoppingCart();
		assertThrows(IllegalArgumentException.class, () -> cart.addItem("Banana", -1.00));
		
	}
	
	@Test
	@DisplayName("Test removing existing item")
	public void testRemoveExistingItem() {
	    ShoppingCart cart = new ShoppingCart();
	    cart.addItem("Milk", 2.50);
	    cart.removeItem("Milk");
	    assertEquals(0.0, cart.getTotalCost(), 0.01);
	}

	@Test
	@DisplayName("Test removing non-existent item")
	public void testRemoveNonExistentItem() {
	    ShoppingCart cart = new ShoppingCart();
	    cart.addItem("Bread", 3.00);
	    cart.removeItem("Cheese");  // not in cart
	    assertEquals(3.00, cart.getTotalCost(), 0.01);  // cost should be unaffected
	}
	
	
	@Test
	@DisplayName("Test applying SAVE10")
	public void testApplySave10() {
		ShoppingCart cart = new ShoppingCart();
		cart.applyDiscountCode("SAVE10");
		assertEquals(10.0, cart.getDiscountPercentage(), 0.01);
		
	}
	
	@Test
	@DisplayName("Test applying SAVE20")
	public void testApplySave20() {
		ShoppingCart cart = new ShoppingCart();
		cart.applyDiscountCode("SAVE20");
		assertEquals(20.0, cart.getDiscountPercentage(), 0.01);
	}
	
	@Test
	@DisplayName("Test applying invalid discount code (expect exception)")
	public void TestApplyInvalidCode() {
		ShoppingCart cart = new ShoppingCart();
		assertThrows(IllegalArgumentException.class, () -> cart.applyDiscountCode("SAVE50"));
	}
	
	@Test
	@DisplayName("Test total cost without discount")
	public void testTotalCostNoDiscount() {
		ShoppingCart cart = new ShoppingCart();
		cart.addItem("Milk", 2.50);
		cart.addItem("Bread", 3.50);
		assertEquals(6.0, cart.getTotalCost(), 0.01);
	}
	
	@Test
	@DisplayName("Test total cost with discount")
	public void testTotalCostWithDiscount() {
		ShoppingCart cart = new ShoppingCart();
		cart.addItem("Milk", 2.50);
		cart.addItem("Bread", 3.50);
		cart.applyDiscountCode("SAVE10");
		assertEquals(5.4, cart.getTotalCost(), 0.01);
	}
	
	
	@Test
	@DisplayName("Test total cost with empty cart")
	public void testTotalCostEmptyCart() {
		ShoppingCart cart = new ShoppingCart();
		assertEquals(0.0, cart.getTotalCost(), 0.01);
	}
}
