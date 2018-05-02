
// Class that sets up the points for the rectangle
class Point {
  private int xxPoint = 0;
  private int yyPoint = 0;

  // constructor
  public Point(int a, int b) {
    xxPoint = a;
    yyPoint = b;
  }
  
  public String printPoint() {
    return "x is " + xxPoint + " y is " + yyPoint;
  }
}