import java.awt.Container;

import javax.swing.JFrame;

public class Frame extends JFrame
{	
	
	public Frame(String title)
	{
		super(title);
      
        ClickerPanel clickerPanel = new ClickerPanel();
        
        // Add components to frame
        Container c = getContentPane();       
        c.add(clickerPanel);
        
        // Frame settings
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
        setSize(600,400);    
        setLayout(null);    
        setVisible(true);
        
	}
}
