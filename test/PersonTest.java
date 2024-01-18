/******
 Name: Danny Lin
 Assignment: Lab 0
 Date: 1/15/2024
 Notes: File to test Person.java
 ******/

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * A JUnit test class for the Person class.
 */
public class PersonTest {

    private Person john;   // The Person object for John
    private Person sally;  // The Person object for Sally

    /**
     * Initializes the Person objects before each test.
     */
    @Before
    public void setUp() {
        john = new Person("john", "doe", 1989);
        sally = new Person("sally", "mae", 1950);
    }

    /**
     * Test case for the getFirstName method of the Person class.
     */
    @Test
    public void testFirstName() {
        assertEquals("john", john.getFirstName());
        assertEquals("sally", sally.getFirstName());
    }

    /**
     * Test case for the getLastName method of the Person class.
     */
    @Test
    public void testLastName() {
        assertEquals("doe", john.getLastName());
        assertEquals("mae", sally.getLastName());
    }

    /**
     * Test case for the getYearOfBirth method of the Person class.
     */
    @Test
    public void testYearOfBirth() {
        assertEquals(1989, john.getYearOfBirth());
        assertEquals(1950, sally.getYearOfBirth());
    }
}
