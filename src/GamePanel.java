import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GamePanel extends JPanel {
	static JLabel currentImage;
	JFrame frame;
	JPanel panel;
	MultipleChoiceQuestion options;

	JLabel text;
	
	// int (W) = WIDTH of frame
	int W = 600;
	// lowercase (w) is width of image being used //jpg
	int w = 400;
	// int (H) is HEIGHT of the frame
	int H = 600;
	// int (h) is the height of the image being used //jpg
	int h = 258;

	public static void main(String[] args) throws MalformedURLException {
		GamePanel construct = new GamePanel();
	}

	GamePanel() throws MalformedURLException {
MultipleChoiceQuestion options = new MultipleChoiceQuestion("worried creatures", "where the wild things go","curious kid", "lol.jpg", 2);
		text= new JLabel("text");
		frame = new JFrame();
		panel = new JPanel();
		frame.setTitle("How Well Do You Know Books?");
		frame.setSize(600, 600);
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
		answer1.setText(options.choice1);
		answer2.setText(options.choice2);
		answer3.setText(options.choice3);

		String wildthing = "lol.jpg";
		JLabel iam = createImage(wildthing);

		iam.setBounds(((W - w) / 2), (H - h) / 3, 400, 258);
		panel.add(iam);
		frame.setVisible(true);

		

	}

	JLabel createImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	
}
