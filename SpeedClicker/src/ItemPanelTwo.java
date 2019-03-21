import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class ItemPanelTwo extends JPanel {

	// Add space img
	private BufferedImage toolImgTwo;

	// Add listner for item click
	private MouseAdapter clickListener = new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {

			// Let player buy item if enough clicks exist
			if (ClickerPanel.clicks >= 10) {

				// Create Woodpecker
				Woodpecker woodpecker = new Woodpecker();
				woodpecker.setItemName("Woodpecker ");
				woodpecker.setPrice(10);

				// Add labels for event
				TimerPanel.eventLabel.setForeground(Color.BLUE);
				TimerPanel.eventLabel.setText("Bought new " + woodpecker.getItemName() + "!");

				// Start timer and autoclick
				woodpecker.start();

				// Remove clicks for purchase
				ClickerPanel.clicks = woodpecker.payPointsWood(ClickerPanel.clicks);
			} else {
				// Add labels for event
				TimerPanel.eventLabel.setForeground(Color.RED);
				TimerPanel.eventLabel.setText("You can't afford the Woodpecker");
			}
		}
	};

	public ItemPanelTwo() {

		// Panel settings
		setBounds(259, 39, 130, 326);
		setLayout(new GridBagLayout());
		setBorder(BorderFactory.createLineBorder(Color.black));

		// Show image
		try {
			toolImgTwo = ImageIO.read(new URL("https://i.imgur.com/rBdaVb4.png?2"));

		} catch (IOException ex) {
			// handle exception...
		}
		addMouseListener(clickListener);
	}

	// Image settings
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(toolImgTwo, 2, 60, this); // see javadoc for more info on the parameters

	}
}
