import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GamePanel {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
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

		frame.setSize(600, 600);
		// answer1.setLocation(40,60);
		frame.setTitle("How Well Do You Know Books?");

	}
}
