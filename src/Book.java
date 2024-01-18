/******
 Name: Danny Lin
 Assignment: Lab 0
 Date: 1/15/2024
 Notes: Book java files that include title, author and price
 ******/

/**
 * This class represents a book. A book has a title, an author, and a price.
 */
public class Book {
  private String title;    // Stores the title of the book
  private Person author;   // Stores the author of the book as a Person object
  private float price;     // Stores the price of the book

  /**
   * Constructs a Book object with the provided title, author, and price.
   *
   * @param title  The title to be given to this book
   * @param author The author to be given to this book as a Person object
   * @param price  The price to be assigned to this book
   */
  public Book(String title, Person author, float price) {
    this.title = title;
    this.author = author;
    this.price = price;
  }

  /**
   * Returns the title of this book.
   *
   * @return The title of this book
   */
  public String getTitle() {
    return this.title;
  }

  /**
   * Returns the price of this book.
   *
   * @return The price of this book
   */
  public float getPrice() {
    return this.price;
  }

  /**
   * Returns the author of this book as a Person object.
   *
   * @return The author of this book as a Person object
   */
  public Person getAuthor() {
    return this.author;
  }
}
