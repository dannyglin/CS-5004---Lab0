/******
 Name: Danny Lin
 Assignment: Lab 0
 Date: 1/15/2024
 Notes: Person java files that include firstname, lastname and yearofbirth
 ******/

/**
 * This class represents a person. The person has a first name, last name, and a year of birth.
 */
public class Person {
  private String firstname; // Stores the first name of the person
  private String lastname;  // Stores the last name of the person
  private int yearofbirth;   // Stores the year of birth of the person

  /**
   * Constructs a person object and initializes it with the given first name, last name, and year of birth.
   *
   * @param firstname   The first name of this person
   * @param lastname    The last name of this person
   * @param yearofbirth The year of birth of this person
   */
  public Person(String firstname, String lastname, int yearofbirth) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.yearofbirth = yearofbirth;
  }

  /**
   * Gets the first name of this person.
   *
   * @return The first name of this person
   */
  public String getFirstName() {
    return this.firstname;
  }

  /**
   * Returns the last name of this person.
   *
   * @return The last name of this person
   */
  public String getLastName() {
    return this.lastname;
  }

  /**
   * Returns the year of birth of this person.
   *
   * @return The year of birth of this person
   */
  public int getYearOfBirth() {
    return this.yearofbirth;
  }
}
