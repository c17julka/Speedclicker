import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class StartingDialogFrame extends JFrame
{

	public StartingDialogFrame()
	{		
		// Frame settings
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200, 160);
		setLayout(new GridBagLayout());
		setLocationRelativeTo(null);
		setVisible(true);
		
		JButton startBtn = new JButton("Start game!");
		
		// Display main game frame when user clicks start button
		startBtn.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) {
				GameFrame frame = new GameFrame("Speedclicker");
				TimerPanel.start(); // Start timer when user clicks btn
				
			}
			
		});
		
		add(startBtn);
		
	}
	
}
