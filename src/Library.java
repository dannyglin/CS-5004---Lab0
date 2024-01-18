/******
 Name: Danny Lin
 Assignment: Lab 0
 Date: 1/15/2024
 Notes: Library file that includes Library name, address and adding and removing books.
 ******/

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a library. A library has a name, an address, and a list of books.
 */
public class Library {
    private String name;      // Stores the name of the library
    private String address;   // Stores the address of the library
    private List<Book> books; // Stores the list of books in the library

    /**
     * Constructs a Library object with the provided name and address.
     *
     * @param name    The name of the library
     * @param address The address of the library
     */
    public Library(String name, String address) {
        this.name = name;
        this.address = address;
        this.books = new ArrayList<>();
    }

    /**
     * Add a book to the library's collection.
     *
     * @param book The book to be added
     */
    public void addBook(Book book) {
        books.add(book);
    }

    /**
     * Remove a book from the library's collection.
     *
     * @param book The book to be removed
     */
    public void removeBook(Book book) {
        books.remove(book);
    }

    /**
     * Get the list of books in the library.
     *
     * @return An unmodifiable view of the list of books
     */
    public List<Book> getBooks() {
        return List.copyOf(books);
    }

    /**
     * Get the name of the library.
     *
     * @return The name of the library
     */
    public String getName() {
        return name;
    }

    /**
     * Get the address of the library.
     *
     * @return The address of the library
     */
    public String getAddress() {
        return address;
    }
}
