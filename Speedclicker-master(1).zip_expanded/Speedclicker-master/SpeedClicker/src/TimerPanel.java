import java.awt.Color;
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
	
	 static Timer itemTimer = new Timer();
	 static TimerTask itemTask = new TimerTask() 
	 {

		public void run() 
		{			
			timerLabel.setText("Timer: " + sekPassed + "s");
			sekPassed++; // Increases every second
			
			// Stops timer at 60 seconds
			if (sekPassed > 60)
			{
				itemTimer.cancel();
				return;
			}
		}
		 
	 }; 
	 
	 public static void start() 
	 {
		 itemTimer.scheduleAtFixedRate(itemTask, 0, 1000); // Timer is set to 1 second
	 }
	  
	 // Does not wööörk
	
	
	
	
	public TimerPanel()
	{
		
		String clickString = "Total clicks: Find out when you're done";
		
		JLabel clickLabel = new JLabel(clickString);
		
		// Panel settings
		setBounds(0,-1,260,102);   	    
	    setLayout(new GridBagLayout());
	    setBorder(BorderFactory.createLineBorder(Color.black));	  
	    
	    GridBagConstraints gbc = new GridBagConstraints();
	    
	    gbc.weightx = 1;
		gbc.weighty = 1;
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		add(clickLabel, gbc);
	    
	    gbc.gridx = 0;
		gbc.gridy = 1;
	    add(timerLabel, gbc);
	}
		
	
}
