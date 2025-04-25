/**
 * Name: Inioluwa Ayo-Lawal
 */
package org.howard.edu.lspfinal.question3;

/**
 * Demonstrates the usage of the reporting system by generating
 * both a sales report and an inventory report.
 * 
 * This class shows how different types of reports can share a
 * common structure while customizing their specific behavior.
 */
public class Driver {
    public static void main(String[] args) {
        Report salesReport = new SalesReport();
        Report inventoryReport = new InventoryReport();

        salesReport.generateReport();
        System.out.println();
        inventoryReport.generateReport();
    }
}
