//Alexis Rappa
//Example of polymorphism through implementing a Java Interface
class StackArray implements Stack {
  public char []stackArray; // array that implements the Stack
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
    StringBuffer aaBuffer = new StringBuffer();
    for (int i = top; i >= 0; i--) {
      aaBuffer.append(stackArray[i] + "  ");
    }
    return aaBuffer.toString();
  }
}

