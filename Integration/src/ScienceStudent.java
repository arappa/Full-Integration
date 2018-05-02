//Alexis Rappa
//Example of overriding a method
public class ScienceStudent extends Student {
  public void info() {
    String studentCol = "Texas A&M University";
    System.out.println("This student attends " + studentCol
        + ". This is also an example of overriding.");
  }
}
