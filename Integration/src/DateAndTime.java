import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

//Alexis Rappa
/*Prints the users current date and time.
 * the current date
 */


public class DateAndTime {
  public static void printDateTime() {

    // the current date
    LocalDate currentDate = LocalDate.now();
    // Formats date
    DateTimeFormatter formatterD = DateTimeFormatter.ofPattern("MM/dd/YYYY");
    String formattedDate = currentDate.format(formatterD);

    // the current time
    LocalTime currentTime = LocalTime.now();
    // Formats Time
    DateTimeFormatter formatterT = DateTimeFormatter.ofPattern("h:mm:ss:SSS a");
    String formattedTime = currentTime.format(formatterT);

    // Prints date and time
    System.out.println("The local date is " + formattedDate
        + " and the local time is " + formattedTime);

  }

}
