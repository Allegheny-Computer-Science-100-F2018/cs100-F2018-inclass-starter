package inclass;

/**
 * This class has a method that shows array declaration and use.
 *
 * <p>Bugs: This program has no known bugs.
 *
 * @author Lewis and Loftus
 */

public class BasicArrayComputations {

  // TODO: Add a comment that explains both of these declarations
  private static final int LIMIT = 15;
  private static final int MULTIPLE = 10;

  /**
   * Demonstrate the use of the array container and the use of loops.
   * Read the documentation in the README to learn about this program.
   * From your "home base", you can run this program with:
   * gradle runBasicArrayComputations
   */
  public static void main(String[] args) {
    // declare and allocate space for the array
    int[] list = new int[LIMIT];

    //  Initialize the array values
    for (int index = 0; index < LIMIT; index++) {
      list[index] = index * MULTIPLE;
    }

    // change one array value
    list[5] = 999;

    // TODO: Add a comment to explain how this for loop works
    for (int value : list) {
      // TODO: Check the book and then add the
      // correct print statement for this for loop
    }
  }

}

// This is the output from running this program:
//
// TODO: Give the output from running this program

// What is the purpose of the LIMIT variable?
//
// TODO: Provided a first sentence.
// TODO: Provided a second sentence.

// What is the purpose of the MULTIPLE variable?
//
// TODO: Provided a first sentence.
// TODO: Provided a second sentence.
