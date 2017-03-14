import java.net.MalformedURLException;

import javax.swing.JFrame;

public class GameLauncher {
	JFrame frame = new JFrame();

	public static void main(String[] args) {
		GameLauncher start = new GameLauncher();
		start.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		start.frame.setTitle("Match the Pic with the Title!?");
		start.frame.setSize(600, 600);

		try {
			GamePanel panel = new GamePanel(start.frame);
			
			start.frame.add(panel);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
