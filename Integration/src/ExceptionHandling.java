//Alexis Rappa
//The code contains two examples of exception handling. In both examples I PURPOSELY throw an exception.
//I have other exceptions handled in my project that takes user input and allows them to try again with a while loop
//if an exception is thrown.
import java.util.ArrayList;

public class ExceptionHandling {
	@SuppressWarnings("null")
	public static void excep() {

		int x, y;

		try {
			// Cast null to be an integer with (Integer) and set int values to null
			x = (Integer) null;
			y = (Integer) null;

			// (FOR EXAMPLE PURPOSES ONLY) Cannot multiply null, I am purposely throwing a
			// NullPointerException
			System.out.println("prod" + x * y);
		} catch (NullPointerException npe) {
			// Prints out error message along with the exception thrown.
			System.out.println("Cannot multiply two integers together when there is no integer values to multiply."
					+ "\nNotify the developer of this null pointer exception. \nException thrown: " + npe);

		}

		finally {
			System.out.println("This is in the finally block. This code will run no matter what.");
		}

		try {
			// Creates string array list without defined number of elements
			ArrayList<String> list = new ArrayList<>();
			// Adding strings to the list
			list.add("Hi");
			list.add("There");
			// Grabs index number 2. List only goes up to index 1. Will throw a
			// IndexOutOfBoundsException
			System.out.println(list.get(2));
		} catch (IndexOutOfBoundsException ioobe) {
			// Prints out error message along with the exception thrown.
			System.out.println("Cannot get the element at index number 2 because it does not exist."
					+ "\nNotify the developer of this index out of bounds exception. \nException thrown: " + ioobe);
		}

		finally {
			System.out.println("Hi, I'm the finally block code.");
		}
	}
}
