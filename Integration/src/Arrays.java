
//Alexis Rappa

/*
* This code does four things with an array. It first finds the smallest number located
* in the array, then it add all the 
*integers in the array together and outputs the sum, than it find the index number 
*that the smallest value was found at, and
*finally it allows you to input a number to see if its in the array then outputs
* its index number.
*/
import javax.swing.JOptionPane;

public class Arrays {
  /**
   * Example of simply adding the numbers of an array together.
   * 
   * @author avrappa3839
   */
  public static void arrayExamples() {
    // The array
    int[] thisArray = { 13, 12, 196, 82, 7, 872, 73, 52, 76, 90, 50, 300, 44 };

    // Finds the smallest value in the array
    int min = thisArray[0];
    for (int i = 1; i < thisArray.length; i++) {
      if (thisArray[i] < min) {
        min = thisArray[i];
      }
    }
    System.out.println("The smallest number found in this array is: " + min);

    // Adds all the integers in the array
    int sum = 0;
    for (int i : thisArray) {
      sum += i;
      System.out.println("The sum of all the numbers in the array is: " + sum);
    }

    // Finds the index number of the smallest value in the array
    int indexOfFind = 0;
    for (int i = 0; i < thisArray.length; i++) {
      if (min == thisArray[i]) {
        indexOfFind = i;
        break;

      }
    }

    System.out.println("The smallest number in the array (" + min
        + ") was located at index number " + indexOfFind);

    /*
     * Code used to accept input from user and lets the user know if the integer
     * was found in the array (Handles Exceptions)
     */
    boolean isPresent = false;
    int index = 0;
    // Use if you want to loop
    // int tryAgain = 1;

    // Use if you want to loop
    // do {
    try {
      int numToFind = Integer.parseInt(JOptionPane
          .showInputDialog("Enter a number to be found in the array."));
      Integer number = Integer.valueOf(numToFind);

      for (int i = 0; i < thisArray.length; i++) {
        if (thisArray[i] == number) {
          isPresent = true;
          index = i;
          // Use if you want to loop
          // tryAgain = 2;
        }
      }

      if (isPresent == true) {
        System.out.println("The number " + numToFind
            + " was found in the array at index number " + index);
      } else {
        System.out.println(
            "The number " + numToFind + " was not found in the array.");
      }
    } catch (NumberFormatException ex) {
      JOptionPane.showMessageDialog(null,
          "That is not a number. Please try again with an integer value." + "\n"
              + "(For developer use) Exception: " + ex,
          "Error", JOptionPane.ERROR_MESSAGE);
    }
    // Use if you want to loop
    // } while (tryAgain == 1);
  }
}
