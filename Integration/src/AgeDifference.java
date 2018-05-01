//Alexis Rappa
//Method declared with header and parameter. Method invoked with call in main.
//This code takes in the int data type from two users and compares them to output the age difference between the users.
public class AgeDifference {
	//Header and person1/person2 parameters 
	public void subtract(int person1, int person2) {
        //Nested else-if statement used if person 1 is older
		if (person1 > person2) {
			int diff = person1 - person2;
			if (diff == 1) {
				System.out.println("The age difference is " + diff + " year.");
			} else {
				System.out.println("The age difference is " + diff + " years.");
			}
		} 
		//Else-if statement used if person 1 and person 2 are the same age
		else if (person1 == person2) {
			System.out.println("You are both the same age. There is no age difference.");

		} 
		//Nested else-if statement used if person 2 is older
		else {
			int diff = person2 - person1;
			if (diff == 1) {
				System.out.println("The age difference is " + diff + " year.");
			} else {
				System.out.println("The age difference is " + diff + " years.");
			}
		}
	}

}
