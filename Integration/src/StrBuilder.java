//Alexis Rappa
//This is code that manipulates data using the StringBuilder class in three different ways.
public class StrBuilder {
  public void doStrB() {
    StringBuilder strB = new StringBuilder();

    // Has three integers and uses sb append to put together IP addresses with
    // the
    // help of a for loop.
    int ip1 = 192;
    int ip2 = 168;
    int ip3 = 1;
    String dot = ".";
    // For loop to put the IP address together. Int i = 1 to start at first part
    // of
    // ip, goes to 255 and increments by 1.
    // Can have as i <= 255 to print out all IP addresses.
    for (int i = 1; i <= 1; i++) {
      strB.append(ip1);
      strB.append(dot);
      strB.append(ip2);
      strB.append(dot);
      strB.append(ip3);
      strB.append(dot);
      strB.append(i);
      System.out.println(strB);
      // Set the length of the sb object to zero(0) so that you can clear the
      // string.
      strB.setLength(0);

      // Deletes sb to reuse
      // strB.delete(0, strB.length());

      // Take a StringBuilder rev and reverses it.
      StringBuilder rev1;

      final StringBuilder rev = new StringBuilder("PI eht si sihT");
      rev1 = rev.reverse();
      System.out.println(rev1);

      final String str1 = "IP Su11essful";

      // Replaces all ones(1) in the string with the letter c. (regex,
      // replacement)
      final String result = str1.replaceAll("1", "c");
      System.out.println(result);

    }
  }
}
