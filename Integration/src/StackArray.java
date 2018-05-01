//Alexis Rappa
//Example of polymorphism through implementing a Java Interface
class StackArray implements Stack {
	public char stackArray[]; // array that implements the Stack
	public int top; // index of the top element in the Stack

	// Constructor
	public StackArray(int n) {
		stackArray = new char[n];
		top = -1;
	}

	// Implementation of the methods in the interface
	public void push(char item) {
		stackArray[++top] = item;
	}

	public char pop() {
		return stackArray[top--];
	}

	public char peek() {
		return stackArray[top];
	}

	public boolean isEmpty() {
		return (top < 0);
	}

	public boolean isFull() {
		return (top == stackArray.length - 1);
	}

	public String toString() {
		StringBuffer aBuffer = new StringBuffer();
		for (int i = top; i >= 0; i--) {
			aBuffer.append(stackArray[i] + "  ");
		}
		return aBuffer.toString();
	}
}

class TestStack {
	public static void stck() {
		Stack theStack = new StackArray(10);
		char ch = ' ';

		if (!theStack.isFull())
			theStack.push('a');

		if (!theStack.isFull())
			theStack.push('b');

		if (!theStack.isFull())
			theStack.push('c');

		if (!theStack.isEmpty())
			ch = theStack.pop();
		System.out.println("The item on top of the stack is " + ch);

		if (!theStack.isEmpty())
			ch = theStack.peek();
		System.out.println("The item on top of the stack is " + ch);

		System.out.println(theStack.toString());
	}

}