//Alexis Rappa
//This is the interface for Stack
interface Stack {
	public void push(char item); // inserts an item at the top

	public char pop(); // removes an item from the top

	public char peek(); // returns an item from the top
	// without removing

	public boolean isEmpty(); // determines if the Stack is empty

	public boolean isFull(); // determines if the Stack is full

	public String toString(); // returns a String representation of
	// the Stack
}


