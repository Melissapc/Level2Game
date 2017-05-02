import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

public class Colorful extends JPanel {

	private final List<Color> colors;
	private final Random random;
	private Color bgColor = Color.PINK;
	Timer timer;

	public Colorful() {

		colors = createColorList();
		random = new Random();

		timer = new Timer(5000, new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				int index = random.nextInt(colors.size());
				bgColor = colors.get(index);

				repaint();
			}
		});
		timer.start();

	}

	private List<Color> createColorList() {
		List<Color> list = new ArrayList<>();
		list.add(Color.PINK);
		list.add(Color.CYAN);
		list.add(Color.ORANGE);
		list.add(Color.MAGENTA);
		list.add(Color.GREEN);
		list.add(Color.GRAY);
		list.add(Color.WHITE);
		return list;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(bgColor);
		g.fillRect(0, 0, getWidth(), getHeight());
	}

}