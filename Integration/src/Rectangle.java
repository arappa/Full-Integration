//Alexis Rappa
//Gets the area of a rectangle
//Access the fields and methods of an object
public class Rectangle {
	// Fields
	public int width = 0;
	public int height = 0;
	public Point origin;

	// four constructors
	public Rectangle() {
		origin = new Point(0, 0);
	}

	public Rectangle(Point p) {
		origin = p;
	}

	public Rectangle(int w, int h) {
		origin = new Point(0, 0);
		width = w;
		height = h;
	}

	public Rectangle(Point p, int w, int h) {
		origin = p;
		width = w;
		height = h;
	}

	// Method for moving the rectangle
	public void move(int x, int y) {
		origin.x = x;
		origin.y = y;
	}

	// Method to get the area of the rectangle
	public void getArea() {
		int area = width * height;
		System.out.println("The area of the rectangle is " + area);
	}

	// Class that sets up the points for the rectangle
	class Point {
		public int x = 0;
		public int y = 0;

		// constructor
		public Point(int a, int b) {
			x = a;
			y = b;
		}
	}

}
