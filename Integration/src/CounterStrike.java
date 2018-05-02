
//Alexis Rappa
import javax.swing.JOptionPane;

public class CounterStrike extends FirstPersonShooter {
  public void ranks() {
    String[] ranks = { "S1", "S2", "S3", "S4", "SE", "SEM", "Nova 1", "Nova 2",
        "Nova 3", "Nova Master", "MG1", "MG2", "MGE", "DMG", "LE", "LEM",
        "SMFC", "Global" };
    String input = (String) JOptionPane.showInputDialog(null,
        "Select your CS:GO matchmaking rank.", "CS:GO MM",
        JOptionPane.QUESTION_MESSAGE, null, // Use
        // default
        // icon
        ranks, // Array of choices
        ranks[1]); // Initial choice

    // Prints out the rank you select
    System.out.println(input);
  }

}
