import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TimerPanel extends JPanel
{
	// Timer related settings
	static int sekPassed = 0;
	static JLabel timerLabel = new JLabel();
	
	 static Timer itemTimer;
	 
	 public static void start() 
	 {
		 TimerTask itemTask = new TimerTask()
		 {

				public void run() 
				{			
					timerLabel.setText("Timer: " + sekPassed + "s");
					sekPassed++; // Increases every second
					
					// Stops timer at 60 seconds
					if (sekPassed > 60)
					{
						
						itemTimer.cancel();
						
						// Creates ending screen + closes game
						EndScreenFrame.finalClicks.setText("Your final amount of clicks: " + ClickerPanel.clicks);
						EndScreenFrame endFrame = new EndScreenFrame();
						StartingDialogFrame.gameFrame.dispose();
						
						// Reset variables
						sekPassed = 0;
						ClickerPanel.clicks = 0;
						return;
					}
				}
				 
			 };
		 itemTimer = new Timer();
		 itemTimer.scheduleAtFixedRate(itemTask, 0, 1000); // Timer is set to 1 second
	 }
		
	// Static variables
	static JLabel eventLabel = new JLabel("");
	static JLabel clickLabel = new JLabel("Total clicks: 0");
	 
	public TimerPanel()
	{
		// Label settings
		//String clickString = "Total clicks: Find out when you're done";		
		
		// Panel settings
		setBounds(0,-1,260,102);   	    
	    setLayout(new GridBagLayout());
	    setBorder(BorderFactory.createLineBorder(Color.black));	  
	    
	    // Set fonts
	    clickLabel.setFont(new Font("Raleway", Font.PLAIN, 14));
	    timerLabel.setFont(new Font("Raleway", Font.PLAIN, 14));
	    
	    GridBagConstraints gbc = new GridBagConstraints();
	    
	    gbc.weightx = 1;
		gbc.weighty = 1;
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		add(clickLabel, gbc);
	    
	    gbc.gridx = 0;
		gbc.gridy = 1;
	    add(timerLabel, gbc);
	    
	    gbc.gridx = 0;
		gbc.gridy = 2;
	    add(eventLabel, gbc);
	}
		
	
}
