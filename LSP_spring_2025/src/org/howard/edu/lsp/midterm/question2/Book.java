package org.howard.edu.lsp.midterm.question2;
/**
 *  Represents a book in the library.
 *  Each book has a title, an author, a unique ISBN, and a publication year.
 *  Implements encapsulation with private attributes and public getters.
 *  Overrides the equals() method to compare books based on ISBN and author.
 *  Overrides the toString() method to return a meaningful book representation.
 */
public class Book {
	private String title;
    private String author;
    private String ISBN;
    private int yearPublished;
    
    
    /**
     * Constructor to initialize book attributes
     * 
     * @param title - The title of the book.
     * @param author - The author of the book.
     * @param ISBN - The unique ISBN identifier of the book.
     * @param yearPublished - The year the book was published.
     */
    public Book(String title, String author, String ISBN, int yearPublished) {
    	this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.yearPublished = yearPublished;
    	
    }
    
    // Getter for title
    public String getTitle() {
        return title;
    }
    
    
    // Getter for author
    public String getAuthor() {
        return author;
    }
    
    // Getter for ISBN
    public String getISBN() {
        return ISBN;
    }
    
    // Getter for year published
    public int getYearPublished() {
        return yearPublished;
    }
    
    
    // Override equals method to compare books based on ISBN and author
    //
    @Override // overiding in java https://www.geeksforgeeks.org/overriding-in-java/#
    public boolean equals(Object obj) {
        if (this == obj) return true; // Check if comparing to itself
        if (!(obj instanceof Book)) return false; // Ensure the object is a Book
        Book other = (Book) obj;
        return this.ISBN.equals(other.ISBN) && this.author.equals(other.author);
    }
    
    
    // Override toString method to provide a readable book description
    @Override // overiding in java https://www.geeksforgeeks.org/overriding-in-java/#
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Year Published: " + yearPublished;
    }

 
    // Main method for testing the Book class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 1925);
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 1925);
        Book book3 = new Book("A Promised Land", "Barack Obama", "9780593239681", 2020);
        System.out.println(book1.equals(book2)); // true
        System.out.println(book1.equals(book3)); // false
        System.out.println(book1); // Output: Title: The Great Gatsby, Author: F. Scott Fitzgerald, ISBN: 123456789, Year Published: 1925

	}

}
