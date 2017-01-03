import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GamePanel2 extends JPanel {
	 static JLabel currentImage;

	public static void main(String[] args) {
		{

			JFrame frame = new JFrame();
			frame.setVisible(true);
			JPanel panel = new JPanel();
			frame.setSize(600, 600);
			frame.setTitle("How Well Do You Know Books?");
			panel.setLayout(null);

			panel.setVisible(true);
			frame.add(panel);
			JButton answer1 = new JButton();
			answer1.setBounds(100, 500, 100, 35);
			JButton answer2 = new JButton();
			answer2.setBounds(250, 500, 100, 35);
			JButton answer3 = new JButton();
			answer3.setBounds(400, 500, 100, 35);
			panel.add(answer1);
			panel.add(answer2);
			panel.add(answer3);

			String wildthing = "lol.jpg";
			BufferedImage iam=createImage(wildthing);
			
			panel.add(iam);
			new GridLayout();
			frame.pack();

		}
	}
	
	
	
 

	static BufferedImage createImage(String fileName) {
		BufferedImage bi;
		try {
			bi= ImageIO.read(this.getClass().getResourceAsStream(fileName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bi;
	}
}
