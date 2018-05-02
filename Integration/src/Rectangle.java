//Alexis Rappa
//Gets the area of a rectangle
//Access the fields and methods of an object
public class Rectangle {
  // Fields
  private int width = 0;
  private int height = 0;
  private Point origin;

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


  // Method to get the area of the rectangle
  public void getArea() {
    int area = width * height;
    System.out.println("The area of the"
        + " rectangle is " + area + " the origin is " + origin.printPoint());
  }



}

