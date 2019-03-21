import java.awt.Container;

import javax.swing.JFrame;

public class GameFrame extends JFrame {

	public GameFrame(String title) {
		super(title);

		// Add panels
		ClickerPanel clickerPanel = new ClickerPanel();
		TimerPanel timerPanel = new TimerPanel();
		ItemPanelOne shopPanelOne = new ItemPanelOne();
		ItemPanelTwo shopPanelTwo = new ItemPanelTwo();
		ItemPanelThree shopPanelThree = new ItemPanelThree();
		ShopHeaderPanel shopHeader = new ShopHeaderPanel();

		// Frame settings
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(535, 400);
		setLayout(null);
		setLocationRelativeTo(null);

		// Add components to frame
		Container c = getContentPane();

		c.add(clickerPanel);
		c.add(timerPanel);
		c.add(shopPanelOne);
		c.add(shopPanelTwo);
		c.add(shopPanelThree);
		c.add(shopHeader);

		if (TimerPanel.sekPassed >= 60) {
			EndScreenFrame endFrame = new EndScreenFrame();
			dispose();
		}
		
		setVisible(true);

	}
}
