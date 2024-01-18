/******
 Name: Danny Lin
 Assignment: Lab 0
 Date: 1/15/2024
 Notes: File to test LibraryTest
 ******/

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * A JUnit test class for the Library class.
 */
public class LibraryTest {

    private Library library;  // The Library object to be tested
    private Book book1;       // First Book object for testing
    private Book book2;       // Second Book object for testing

    @Before
    public void setup() {
        library = new Library("City Library", "123 Main St");
        Person author = new Person("Stan", "Lee", 1922);
        book1 = new Book("Spiderman", author, 13.0f);
        book2 = new Book("X-Men", author, 15.0f);
    }

    /**
     * Test case for the addBook method of the Library class.
     */
    @Test
    public void testAddBook() {
        library.addBook(book1);
        library.addBook(book2);

        assertEquals(2, library.getBooks().size());
        assertTrue(library.getBooks().contains(book1));
        assertTrue(library.getBooks().contains(book2));
    }

    /**
     * Test case for the removeBook method of the Library class.
     */
    @Test
    public void testRemoveBook() {
        library.addBook(book1);
        library.addBook(book2);

        library.removeBook(book1);

        assertEquals(1, library.getBooks().size());
        assertTrue(library.getBooks().contains(book2));
    }

    /**
     * Test case for the getBooks method of the Library class.
     */
    @Test
    public void testGetBooks() {
        library.addBook(book1);
        library.addBook(book2);

        assertEquals(2, library.getBooks().size());
        assertTrue(library.getBooks().contains(book1));
        assertTrue(library.getBooks().contains(book2));
    }

    /**
     * Test case for the getName method of the Library class.
     */
    @Test
    public void testGetName() {
        assertEquals("City Library", library.getName());
    }

    /**
     * Test case for the getAddress method of the Library class.
     */
    @Test
    public void testGetAddress() {
        assertEquals("123 Main St", library.getAddress());
    }
}
