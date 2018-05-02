import javax.swing.JOptionPane;

//Alexis Rappa
public class FirstPersonShooter {

  public static void fps() {
    String[] system = { "PC", "Xbox", "Playstation", "Nintendo" };
    String input = (String) JOptionPane.showInputDialog(null,
        "Select your system of choice.", "Platform",
        JOptionPane.QUESTION_MESSAGE, null, // Use
        // default
        // icon
        system, // Array of choices
        system[1]); // Initial choice

    // Prints out the rank you select
    System.out.println(input);

    if (input == "PC") {
      String[] topPcGames = { "Rainbow Six Siege", "CSGO", "Other" };
      String pcGame = (String) JOptionPane.showInputDialog(null,
          "Select your game of choice.", "Game", JOptionPane.QUESTION_MESSAGE,
          null, // Use
          // default
          // icon
          topPcGames, // Array of topPCGames
          topPcGames[1]);
      System.out.println(pcGame);

      if (pcGame == "CSGO") {
        CounterStrike player1 = new CounterStrike();
        player1.ranks();
      }

    } else if (input == "Xbox") {
      String[] topXboxGames = { "Rainbow Six Siege", "CSGO", "Other" };
      String xboxGame = (String) JOptionPane.showInputDialog(null,
          "Select your game of choice.", "Game", JOptionPane.QUESTION_MESSAGE,
          null, // Use
          // default
          // icon
          topXboxGames, // Array of topPCGames
          topXboxGames[1]);
      System.out.println(xboxGame);
    } else if (input == "Playstation") {
      String[] topPlaystationGames = { "Rainbow Six Siege", "CSGO", "Other" };
      String playstationGame = (String) JOptionPane.showInputDialog(null,
          "Select your game of choice.", "Game", JOptionPane.QUESTION_MESSAGE,
          null, // Use
          // default
          // icon
          topPlaystationGames, // Array of topPCGames
          topPlaystationGames[1]);
      System.out.println(playstationGame);

    }

  }
}
