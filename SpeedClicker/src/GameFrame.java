import java.awt.Container;

import javax.swing.JFrame;

public class GameFrame extends JFrame
{	
	
	public GameFrame(String title)
	{
		super(title);
      
        ClickerPanel clickerPanel = new ClickerPanel();
        TimerPanel timerPanel = new TimerPanel();
        ShopPanel shopPanel = new ShopPanel();
        
       // Frame settings
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(535,400);    
        setLayout(null);
        setLocationRelativeTo(null);       
        setVisible(true);
        
        
        
        // Add components to frame
        Container c = getContentPane();
        
        c.add(clickerPanel);
        c.add(timerPanel);
        c.add(shopPanel);
        
        
        
	}
}
