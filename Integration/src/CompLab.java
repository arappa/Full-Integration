//Alexis Rappa
//Creation of fields and methods and static fields and methods
//to get the amount of computers available.
public class CompLab {

  // Fields
  private int compNum;
  private int identity;

  private int id;

  // Creation of static field
  public static int numberOfComputers = 0;

  /** Counts the number of computers a lab receives.
   * @author avrappa3839
   * @param countCompNum Keeps running count of the numbers of computers.
   * @param startIdentity Keeps track if id of computer.
   */
  public CompLab(int countCompNum, int startIdentity) {
    compNum = countCompNum;
    identity = startIdentity;

  }

  public int getiD() {
    return id;
  }

  // Creation of static method
  public static int getNumberOfComputers() {
    return numberOfComputers;
  }

  public int getCompNum() {
    return compNum;
  }

  public void setCompNum(int newValue) {
    compNum = newValue;
  }

  public int getID1() {
    return identity;
  }

  public void setID1(int newValue) {
    identity = newValue;
  }

  public void compBreak(int decrement) {
    compNum -= decrement;
  }

  public void compRepair(int increment) {
    compNum += increment;
  }
}