//Alexis Rappa
//Methods of the String class used to effectively manipulate text. 
public class StringManip {
  public static void stringUsage() {

    // Takes a string and assigns substring to variable "steamUserName"
    String twitchUser = "Follow me on twitch over at twitch.tv/snowcattt";

    String steamUserName = twitchUser.substring(38, 47);

    System.out.println(
        "My steam account is https://steamcommunity.com/id/" + steamUserName);

    /*
     * Uses a boolean to check and see if the string "gamerTag" contains a char
     * sequence that of string "check" then outputs a string after an else-if
     * statement runs
     */
    String gamerTag = "snowcattt";
    String check = "snow";
    boolean boolCheck = gamerTag.contains(check);
    if (boolCheck == true) {
      System.out.println("The string " + gamerTag
          + " contains the char sequence " + check + ".");
    } else {
      System.out.println("The string " + gamerTag
          + "does not contain the char sequence " + check + ".");
    }

    /*
     * Takes a string and converts it uppercase with the use of the .toUpperCase
     * method
     */
    String lowerCase = "this sentence was converted to uppercase.";

    String changeToUpperCase = lowerCase.toUpperCase();

    System.out.println(changeToUpperCase);

  }
}
