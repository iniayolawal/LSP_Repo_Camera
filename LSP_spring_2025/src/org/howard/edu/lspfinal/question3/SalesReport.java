package org.howard.edu.lspfinal.question3;

/**
 * Concrete implementation of {@link Report} that represents a sales report.
 * 
 * Each step in the report workflow is specialized to reflect the behavior
 * and output expected for a sales report.
 */
public class SalesReport extends Report {

    /**
     * Loads sales data from the sales system.
     */
    @Override
    protected void loadData() {
        System.out.println("Loading sales data...");
    }

    /**
     * Applies formatting specific to sales reports.
     */
    @Override
    protected void formatData() {
        System.out.println("Formatting sales data...");
    }

    /**
     * Prints the final sales report to the console.
     */
    @Override
    protected void printReport() {
        System.out.println("Printing sales report.");
    }
}
