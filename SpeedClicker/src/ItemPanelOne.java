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

public class ItemPanelOne extends JPanel {

	private BufferedImage toolImgOne;

	Sledgehammer sledgehammer;

	private MouseAdapter clickListener = new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {

			// Let player buy item if enough clicks exist
			if (ClickerPanel.clicks >= 25) {

				// Create Sledgehammer
				sledgehammer = new Sledgehammer();
				sledgehammer.setItemName("Sledgehammer ");
				sledgehammer.setPrice(25);

				TimerPanel.eventLabel.setForeground(Color.BLUE);
				TimerPanel.eventLabel.setText("Bought new " + sledgehammer.getItemName() + "!");

				sledgehammer.payPointsSledge(ClickerPanel.clicks);

				sledgehammer.start();

				ClickerPanel.clicks = sledgehammer.payPointsSledge(ClickerPanel.clicks);

			} else {
				TimerPanel.eventLabel.setForeground(Color.RED);
				TimerPanel.eventLabel.setText("You can't afford the Sledgehammer");
			}
		}

	};

	public ItemPanelOne() {

		// Panel settings
		setBounds(259, 39, 132, 167);
		setLayout(new GridBagLayout());
		setBorder(BorderFactory.createLineBorder(Color.black));

		// Show image
		try { // change this img for a free to use
			toolImgOne = ImageIO.read(new URL("https://i.imgur.com/3CjxbYm.png?1"));

		} catch (IOException ex) {
			// handle exception...
		}
		addMouseListener(clickListener);
	}

	// Image settings
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(toolImgOne, 1, 15, this); // see javadoc for more info on the parameters

	}

}
