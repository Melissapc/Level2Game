import java.net.MalformedURLException;

import javax.swing.JFrame;

public class GameLauncher {
	JFrame frame = new JFrame();

	public static void main(String[] args) {
		GameLauncher start = new GameLauncher();
		start.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		start.frame.setTitle("guess the uno");
		start.frame.setSize(600, 600);
		start.frame.setVisible(true);

		try {
			GamePanel panel = new GamePanel(start.frame);

			// start.frame.add(panel);
		} catch (MalformedURLException e) {

			e.printStackTrace();
		}
	}

}
