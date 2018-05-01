import javax.swing.JOptionPane;

//Alexis Rappa
public class FirstPersonShooter {

	public static void fps() {
		String[] system = {"PC", "Xbox", "Playstation", "Nintendo"};
		String input = (String) JOptionPane.showInputDialog(null, "Select your system of choice.", "Platform",
				JOptionPane.QUESTION_MESSAGE, null, // Use
													// default
													// icon
				system, // Array of choices
				system[1]); // Initial choice
		
		//Prints out the rank you select
		System.out.println(input);
		
		if (input == "PC") {
			String[] topPCGames = {"Rainbow Six Siege", "CSGO", "Other"};
			String pcGame = (String) JOptionPane.showInputDialog(null, "Select your game of choice.", "Game",
					JOptionPane.QUESTION_MESSAGE, null, // Use
														// default
														// icon
					topPCGames, // Array of topPCGames
					topPCGames[1]);
			System.out.println(pcGame);
			
			if(pcGame == "CSGO") {
				CSGO player1 = new CSGO();
				player1.ranks();
			}
			
		}
		
		else if (input == "Xbox") {}
		else if (input == "Playstation") {}
		else {
			
		}
		
		
		
	}
}
