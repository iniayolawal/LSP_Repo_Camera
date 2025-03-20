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
    
    public Book(String title, String author, String ISBN, int yearPublished) {
    	this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.yearPublished = yearPublished;
    	
    }
    
    
    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public String getISBN() {
        return ISBN;
    }
    public int getYearPublished() {
        return yearPublished;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Check if comparing to itself
        if (!(obj instanceof Book)) return false; // Ensure the object is a Book
        Book other = (Book) obj;
        return this.ISBN.equals(other.ISBN) && this.author.equals(other.author);
    }

    
    
    
    
    
    
    
    
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
