import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class EndScreenFrame extends JFrame
{

	// Static variables
	static JLabel finalClicks = new JLabel();
	
	public EndScreenFrame()
	{
		// Frame settings
		setTitle("Speedclicker");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(360, 150);
		setLayout(new GridBagLayout());
		setLocationRelativeTo(null);
		
		JButton replayBtn = new JButton("Replay");
		
		// Replay the game - button listener
		replayBtn.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				dispose();
				StartingDialogFrame start = new StartingDialogFrame();			
				
			}
			
		});
		
		// Create label and change fonts
		JLabel congratsLabel = new JLabel();
		congratsLabel.setFont(new Font("Raleway", Font.PLAIN, 14));
		finalClicks.setFont(new Font("Raleway", Font.PLAIN, 22));
		
		// Gives message depending on how many clicks you got
		if (ClickerPanel.clicks < 1000)
		{
			congratsLabel.setText("Yeah... you can do better than that.");
		}
		else if (ClickerPanel.clicks >= 1000 && ClickerPanel.clicks < 5000)
		{
			congratsLabel.setText("At least it's a bronze rank...");
		}
		else if (ClickerPanel.clicks >= 5000 && ClickerPanel.clicks < 10000)
		{
			congratsLabel.setText("Silver rank, so close to the gold.");
		}
		else
		{
			congratsLabel.setText("You got the gold rank, you rock!");
		}
				

		// Add components to frame
		GridBagConstraints gbc = new GridBagConstraints();
	    
	    gbc.weightx = 1;
		gbc.weighty = 1;
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		
		add(finalClicks, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		
		add(congratsLabel, gbc);
		
//		gbc.gridx = 0;
//		gbc.gridy = 2;
//		
//		add(replayBtn, gbc);
		
		setVisible(true);
		
	}
	
}
