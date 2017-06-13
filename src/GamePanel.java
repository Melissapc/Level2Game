import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements MouseListener, ActionListener {
	static JLabel currentImage;
	JFrame frame;
	MultipleChoiceQuestion options;
	
	Font scorefont;
	private int score = 0;
	JLabel scoreLabel = new JLabel("Score: 0");

	JLabel text;
	JLabel imageLabel = new JLabel();
	JButton answer1;
	JButton answer2;
	JButton answer3;

	int buttonHeight = GameLauncher.H / 5;
	int buttonY = GameLauncher.H - buttonHeight;
	int buttonWidth = GameLauncher.W / 7;

	String hoverButton = "";
	QuestionArray questions;
	MultipleChoiceQuestion question;
	private final List<Color> colors;
	private final Random random;
	private Color bgColor;
	Timer timer;

	// (w) is width of image being used //jpg
	int w;

	// (h) is the height of the image being used //jpg
	int h;

	GamePanel(JFrame frame) throws MalformedURLException {

		this.frame = frame;
		colors = createColorList();
		random = new Random();
		questions = new QuestionArray();
		getNewQuestion();
		if (question == null) {
			JOptionPane.showMessageDialog(null, "game over");
		} else {
			panelRemake();
		}
		timer = new Timer(1000, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = random.nextInt(colors.size());
				bgColor = colors.get(index);

				repaint();
			}

		});
		timer.start();
		scoreLabel.setBounds(50, 50, 200, 50);
	}

	private List<Color> createColorList() {
		List<Color> list = new ArrayList<>();
		list.add(Color.BLUE);
		list.add(Color.CYAN);
		list.add(Color.PINK);
		list.add(Color.ORANGE);
		list.add(Color.MAGENTA);
		list.add(Color.GREEN);
		list.add(Color.YELLOW);
		list.add(Color.RED);
		list.add(Color.GRAY);
		return list;
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(bgColor);
		g.fillRect(0, 0, getWidth(), getHeight());
	}

	private void panelRemake() {
		text = new JLabel("text");
		// panel = new Colorful();
		setLayout(null);
		frame.add(this);
		add(scoreLabel);
		String image = question.image;
		imageLabel = createImage(image);
		add(imageLabel);
		setVisible(true);

		// first button
		answer1 = new JButton();
		answer1.setName("first button");
		answer1.addMouseListener(this);
		answer1.addActionListener(this);
		answer1.setBounds(buttonWidth, buttonY, buttonWidth, 35);
		if (hoverButton.equals("first")) {

		}
		// second button
		answer2 = new JButton();
		answer2.setName("second button");
		answer2.addMouseListener(this);
		answer2.setBounds(3 * buttonWidth, buttonY, buttonWidth, 35);
		answer2.addActionListener(this);

		// third button
		answer3 = new JButton();
		answer3.setName("third button");
		answer3.addMouseListener(this);
		answer3.setBounds(5 * buttonWidth, buttonY, buttonWidth, 35);
		answer3.addActionListener(this);

		// adds buttons to panel
		add(answer1);
		add(answer2);
		add(answer3);

		answer1.setText(question.choice1);
		answer2.setText(question.choice2);
		answer3.setText(question.choice3);
		setVisible(true);

	}

	private JLabel createImage(String fileName) {
		try {
			URL imageURL = getClass().getResource(fileName);
			Icon icon = new ImageIcon(imageURL);
			JLabel imageLabel = new JLabel(icon);

			w = icon.getIconWidth();
			h = icon.getIconHeight();
			System.out.println("icon w " + w);
			System.out.println("icon h " + h);

			if (imageLabel != null) {
				imageLabel.setBounds(((GameLauncher.W - w) / 2), (GameLauncher.H - h) / 3, w, h);
				return imageLabel;
			}
		} catch (Exception e) {

		}
		return null;
	}

	public void mouseClicked(MouseEvent e) {
		String name = (e.getComponent().getName());
		if (name != null) {

			if (question.checkAnswer(name)) {
				plusPoint();
				removeAll();
				getNewQuestion();

				if (question == null) {
					JOptionPane.showMessageDialog(null,
							"Game Over! You SCORED " + getScore() + " POINTS out of " + questions.totalPoints());
					System.exit(0);
				} else {

					panelRemake();
					frame.validate();
					frame.repaint();
				}
			} else {
				minusPoint();

				frame.repaint();

			}
		}
	}

	public void minusPoint() {
		setScore(score--);
	}

	public void plusPoint() {
		setScore(score++);

	}

	public int getScore() {

		return score;
	}

	public void setScore(int s) {
		// score = s;
		scoreLabel.setText("Score " + score);

	}

	public void mouseEntered(MouseEvent e) {

		hoverButton = e.getComponent().getName();
		System.out.println(hoverButton);
		int buttonWidth = imageLabel.getWidth() / 3;
		if (e.getSource() == answer1) {
			answer1.setBounds(imageLabel.getX(), buttonY - buttonHeight, buttonWidth, 150);

		}
		if (e.getSource() == answer2) {
			answer2.setBounds(imageLabel.getX() + buttonWidth, buttonY - buttonHeight, buttonWidth, 150);

		}
		if (e.getSource() == answer3) {
			answer3.setBounds(imageLabel.getX() + (buttonWidth * 2), buttonY - buttonHeight, buttonWidth, 150);
		}
	}

	public void mouseExited(MouseEvent e) {

		hoverButton = "";

	}

	void getNewQuestion() {
		question = questions.getNewQuestion();

	}

	public void actionPerformed(ActionEvent e) {
		System.out.println("game panel action");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}