//Alexis Rappa
public class Casting {
  /**Examples of casting without error.
   * @author avrappa3839
   */
  public static void castExample() {
    double num1 = 13.37;
    double num2 = 73.31;
    double sumOfNum = num1 + num2;
    double reg = sumOfNum;
    System.out.println(reg + " is the sum is without casting.");
    int cast = (int) sumOfNum;
    System.out
        .println(cast + " is the sum when casting from a double to an int.");
  }
}
