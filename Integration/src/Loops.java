//Alexis Rappa
//This code demonstrates the use of a while loop, a for loop, and a for-each loop as different counters.
public class Loops {
	public static void counters() {

		// For loop that increments by ten(10) until the counter reaches fifty(50).
		for (int counter = 0; counter <= 50; counter += 10) {
			System.out.println(counter);
		}

		// While loop that increments counterNum by one with the use of ++ till it
		// reaches ten(10).
		int counterNum = 0;
		while (counterNum < 10) {
			System.out.println(counterNum);
			counterNum++;
		}

		// For-each loop that adds all the numbers in the array.
		int randomArray[] = { 1337, 12, 26, 67, 79 };
		int total = 0;

		for (int x : randomArray) {
			total += x;
		}

		System.out.println("The total of the array is " + total);
	}

}
