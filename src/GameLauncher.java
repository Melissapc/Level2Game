import java.net.MalformedURLException;

import javax.swing.JFrame;

public class GameLauncher {
	public static int W = 1600;
	public static int H = 1000;

	JFrame frame = new JFrame();

	public static void main(String[] args) {
		GameLauncher start = new GameLauncher();
		start.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		start.frame.setTitle("Screenerrrs");
		start.frame.setSize(W, H);
		start.frame.setVisible(true);

		try {
			GamePanel panel = new GamePanel(start.frame);

		} catch (MalformedURLException e) {

			e.printStackTrace();
		}
	}

}
