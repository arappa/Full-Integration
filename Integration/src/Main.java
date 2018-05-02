
//Alexis Rappa

//This project is a collection of all the different skills I have learned over
//the semester put into one program.
import javax.swing.JOptionPane;

public class Main {

  public static void main(String[] args) {
    // Welcome message
    System.out.println(
        "Hello Professor Vanselow, this here is my integration project. This"
        + " project will show all the skills that I have learned over the"
        + " semester through a series of examples. Enjoy!");

    // Calls the Variables class
    Varibles.randomVar();

    // Calls the NumericAndStringData class
    NumericAndStringData.dataExamples();

    // Calls the Casting class
    Casting.castExample();

    // Creation of Person object
    Person p1 = new Person();
    p1.setName("User");
    p1.setGender("Male");
    p1.setAge(25);
    System.out.println("NAME: " + p1.getName() + " GENDER: " + p1.getGender()
        + " AGE: " + p1.getAge());

    // Calls the StringManip class
    StringManip.stringUsage();

    // Method from AgeDifference class invoked with a call
    AgeDifference age = new AgeDifference();

    /*
     * Person values sent to the method (arguments) (will handle exceptions and
     * allows user to try again with do-while loop)
     */

    int tryAgain = 1;
    do {
      try {
        int person1 = Integer.parseInt(
            JOptionPane.showInputDialog("Enter the first persons age."));
        int person2 = Integer.parseInt(
            JOptionPane.showInputDialog("Enter the second persons age."));
        // Method invoked
        age.subtract(person1, person2);
        tryAgain = 2;
      } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null,
            "That is not a number. Please try again with an integer value."
                + "\n" + "(For developer use) Exception: " + ex,
            "Error", JOptionPane.ERROR_MESSAGE);
      }
    } while (tryAgain == 1);

    // Calls Arrays class
    Arrays.arrayExamples();

    // Calls Loops class
    Loops.counters();

    // StringBuilder class
    new StrBuilder().doStrB();

    // Prints date and time from DateAndTime class
    DateAndTime.printDateTime();

    // Calls Lambda class
    Lambda.doMath();

    /*
     * COME BACK TO THIS LATER
     */
    FirstPersonShooter.fps();
    CounterStrike player1 = new CounterStrike();
    player1.ranks();

    // Inheritance example
    EngineeringStudent s1 = new EngineeringStudent();
    s1.info();

    // This inheritance example is also overriding methods
    ScienceStudent s2 = new ScienceStudent();
    s2.info();

    /*
     * Polymorphism example You can assign different objects to variables as
     * long as its reference variable is of the superclass type.
     */
    Sport []start = new Sport[3];
    start[0] = new Sport();
    start[1] = new Hockey();
    start[2] = new Soccer();

    for (int i = 0; i < 3; i++) {
      start[i].play();
    }

    // Polymorphism demonstration by implementing a Java Interface
    TestStack.stck();

    // Exception Handling
    ExceptionHandling.excep();

    // Hierarchical Inheritance
    Kid1 object1 = new Kid1();
    Kid2 object2 = new Kid2();
    Kid3 object3 = new Kid3();

    // All of the objects created above can access the method of class Parent
    object1.methodA();
    object2.methodA();
    object3.methodA();

    // Running the encapsulated class
    PersonInfo encap = new PersonInfo();
    encap.setName("Jake");
    encap.setAge(24);
    encap.setIdNum("14323ms");

    System.out.print("Name : " + encap.getName() + " Age : " + encap.getAge());

    // Access static fields and method
    ValueOfPi.numOfPi();

    // Access the fields and methods of an object
    Rectangle r1 = new Rectangle(200, 200);
    r1.getArea();

  }

}
