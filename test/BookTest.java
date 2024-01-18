/******
 Name: Danny Lin
 Assignment: Lab 0
 Date: 1/15/2024
 Notes: File to test Book.java
 ******/

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * A JUnit test class for the Person class.
 */
public class BookTest {
    /**
     * Initializes the Book objects before each test.
     */
    private Book book;      // The Book object to be tested
    private Person author;   // The Person object representing the author of the book

    @Before
    public void setup() {
        author = new Person("Stan", "Lee", 1950);
        book = new Book("Spiderman", author, 13);
    }

    /**
     * Test case for the getTitle method of the Book class.
     */
    @Test
    public void testGetTitle() {
        assertEquals("Spiderman", book.getTitle());
    }

    /**
     * Test case for the getAuthor method of the Book class.
     */
    @Test
    public void testGetAuthor() {
        assertEquals(author, book.getAuthor());
    }

    /**
     * Test case for the getPrice method of the Book class.
     */
    @Test
    public void testGetPrice() {
        assertEquals(13, book.getPrice(), 0.001);
    }
}
