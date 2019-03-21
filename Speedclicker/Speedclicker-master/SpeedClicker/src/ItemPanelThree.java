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

public class ItemPanelThree extends JPanel {

	// Add space img
	private BufferedImage toolImgThree;

	// Add listner for item click
	private MouseAdapter clickListener = new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			
			// Let player buy item if enough clicks exist
			if (ClickerPanel.clicks >= 200) {

				// Create Woodpecker
				WreckingBall wreckingBall = new WreckingBall();
				wreckingBall.setItemName("WreckingBall ");
				wreckingBall.setPrice(200);

				// Add labels for event 
				TimerPanel.eventLabel.setForeground(Color.BLUE);
				TimerPanel.eventLabel.setText("Bought new " + wreckingBall.getItemName() + "!");

				// Start timer and autoclick
				wreckingBall.start();

				// Remove clicks for purchase
				ClickerPanel.clicks = wreckingBall.payPointsWreck(ClickerPanel.clicks);
			} else {
				// Add labels for event 
				TimerPanel.eventLabel.setForeground(Color.RED);
				TimerPanel.eventLabel.setText("You can't afford the Wrecking ball");
			}
		}
	};

	public ItemPanelThree() {

		// Panel settings
		setBounds(388, 195, 132, 170);
		setLayout(new GridBagLayout());
		setBorder(BorderFactory.createLineBorder(Color.black));

		// Show image
		try {
			toolImgThree = ImageIO.read(new URL("https://i.imgur.com/y8E4EIA.png?1"));

		} catch (IOException ex) {
			// handle exception...
		}
		addMouseListener(clickListener);
	}

	// Image settings
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(toolImgThree, 1, 5, this); // see javadoc for more info on the parameters

	}

}
