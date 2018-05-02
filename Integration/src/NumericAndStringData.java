//Alexis Rappa
//This code is used to demonstrate the use of the basic operators.
public class NumericAndStringData {
  public static void dataExamples() {

    System.out.println("This" + " is an example" + " of concatenation"
        + " of string data" + " with the use of the" + " + operator.");

    double do1 = 1.5;
    double do2 = 13.37;

    // Use of the - operator
    double difference = do1 - do2;
    System.out
        .println("The difference between the two numbers is: " + difference);

    // Use of the * operator
    double product = do1 * do2;
    System.out.println("The product between the two numbers is: " + product);

    // Use of the / operator
    double quotient = do2 / do1;
    System.out.println("The quotient between the two numbers is: " + quotient);

    // Use of the % operator
    double remainder = do1 % do2;
    System.out
        .println("The remainder between the two numbers is: " + remainder);

  }

}
