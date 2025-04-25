/**
 * Name: Inioluwa Ayo-Lawal
 * 
 * References:
 * https://refactoring.guru/design-patterns/template-method
 * https://stackoverflow.com/questions/19174535/when-to-use-template-method-pattern
 * https://www.baeldung.com/java-template-method-pattern
 */
package org.howard.edu.lspfinal.question3;

/**
 * Abstract base class representing a generic report.
 * 
 * This class defines a template method {@code generateReport()} that outlines
 * the overall structure of report generation: loading data, formatting it,
 * and printing the final report.
 * 
 * Subclasses must provide concrete implementations for each step.
 */
public abstract class Report {

    /**
     * Template method that defines the fixed sequence of steps for generating a report.
     * 
     * This method should not be overridden.
     */
    public final void generateReport() {
        loadData();
        formatData();
        printReport();
    }

    /**
     * Loads the data needed for the report.
     * This method is implemented by concrete subclasses.
     */
    protected abstract void loadData();

    /**
     * Formats the loaded data for presentation.
     * This method is implemented by concrete subclasses.
     */
    protected abstract void formatData();

    /**
     * Prints the final version of the report.
     * This method is implemented by concrete subclasses.
     */
    protected abstract void printReport();
}
