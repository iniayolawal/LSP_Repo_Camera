/**
 * Name: Inioluwa Ayo-Lawal
 */
package org.howard.edu.lspfinal.question3;

/**
 * Concrete implementation of {@link Report} that represents an inventory report.
 * 
 * Each step in the report workflow is customized for inventory-specific content.
 */
public class InventoryReport extends Report {

    /**
     * Loads inventory data from the inventory database.
     */
    @Override
    protected void loadData() {
        System.out.println("Loading inventory data...");
    }

    /**
     * Applies formatting specific to inventory reports.
     */
    @Override
    protected void formatData() {
        System.out.println("Formatting inventory data...");
    }

    /**
     * Prints the final inventory report to the console.
     */
    @Override
    protected void printReport() {
        System.out.println("Printing inventory report.");
    }
}
