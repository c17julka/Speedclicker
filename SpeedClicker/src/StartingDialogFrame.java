import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class StartingDialogFrame extends JFrame
{
	
	static GameFrame gameFrame;

	public StartingDialogFrame()
	{		
		// Frame settings
		setTitle("Speedclicker");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(320, 200);
		setLayout(new GridBagLayout());
		setLocationRelativeTo(null);
		setVisible(true);
		
		JButton startBtn = new JButton("Start game!");
		
		// Display main game frame when user clicks start button - button listener
		startBtn.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				dispose();
				gameFrame = new GameFrame("Speedclicker");
				TimerPanel.start(); // Start timer when user clicks btn				
				
			}
			
		});
		
		// Create Swing components
		JLabel welcome = new JLabel("Welcome to Speedclicker!");
		JLabel rule1 = new JLabel("Click the creature to gain points");
		JLabel rule2 = new JLabel("Shop for items to auto increase your points");
		JLabel rule3 = new JLabel("You have 1 minute");
		
		// Add components to frame
		GridBagConstraints gbc = new GridBagConstraints();
	    
	    gbc.weightx = 1;
		gbc.weighty = 1;
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		
		add(welcome, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		
		add(rule1, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 2;
		
		add(rule2, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 3;
		
		add(rule3, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 4;
		
		add(startBtn, gbc);
		
	}
	
}
