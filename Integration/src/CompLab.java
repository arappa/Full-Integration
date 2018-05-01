//Alexis Rappa
//Creation of fields and methods and static fields and methods to get the amount of computers available.
public class CompLab {

	//Fields
	private int compNum;
	private int ID;

	private int id;

	//Creation of static field
	public static int numberOfComputers = 0;

	public CompLab(int countCompNum, int startID) {
		compNum = countCompNum;
		ID = startID;

		//Increments by 1
		id = ++numberOfComputers;
	}

	public int getID() {
		return id;
	}

	//Creation of static method
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
		return ID;
	}

	public void setID1(int newValue) {
		ID = newValue;
	}


	public void compBreak(int decrement) {
		compNum -= decrement;
	}

	public void compRepair(int increment) {
		compNum += increment;
	}
}