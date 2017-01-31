import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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

public class GamePanel extends JPanel implements MouseListener {
	static JLabel currentImage;
	JFrame frame;
	JPanel panel;
	MultipleChoiceQuestion options;
	JLabel text;
	String hoverButton="";
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
		MultipleChoiceQuestion options = new MultipleChoiceQuestion("worried creatures", "where the wild things go",
				"curious kid", "lol.jpg", 2);
		text = new JLabel("text");
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new Colorful();
		frame.setTitle("How Well Do You Know Books?");
		frame.setSize(600, 600);
		panel.setLayout(null);
		panel.setVisible(true);
		frame.add(panel);

		// first button
		JButton answer1 = new JButton();
		answer1.setName("first");
		answer1.addMouseListener(this);
		answer1.setBounds(100, 500, 100, 35);
		if(hoverButton.equals("first")){
			//add a jlabel to the screen to show a popup for the full sentece !
		}

		// second button
		JButton answer2 = new JButton();
		answer2.setName("second button");
		answer2.addMouseListener(this);
		answer2.setBounds(250, 500, 100, 35);

		// third button
		JButton answer3 = new JButton();
		answer3.setName("third button");
		answer3.addMouseListener(this);
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

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {

		hoverButton = e.getComponent().getName();
		System.out.println(hoverButton);
	}

	@Override
	public void mouseExited(MouseEvent e) {

		hoverButton = "";

	}

}
