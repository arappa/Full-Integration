//Alexis Rappa
//Very simple example of creation of static method and fields 
//to display the value of pi in a very inefficient manner
public class ValueOfPi {
  // Static fields
  static double pi;
  static int constant = 1;

  // Static method numOfPi
  public static void numOfPi() {
    double value = pi * constant;
    System.out.println("\nThe value of pi is " + value);
  }
}
