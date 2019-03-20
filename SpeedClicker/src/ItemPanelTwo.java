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

public class ItemPanelTwo extends JPanel{

	private BufferedImage toolImgOne;
	
static int itemClick = 0;
	
	private MouseAdapter clickListener = new MouseAdapter() 
	{
	    public void mouseClicked(MouseEvent e) 
	    {
	    	
	    	itemClick++;
	    	
	    	if (ClickerPanel.clicks >= 30) {
	    		
	    		// change img (?)
	    		// Create Woodpecker
		Woodpecker woodpecker = new Woodpecker();
		woodpecker.setItemName("Woodpecker ");
		woodpecker.setPrice(30);
		
		TimerPanel.eventLabel.setForeground(Color.BLUE);
		TimerPanel.eventLabel.setText("Bought new Woodpecker!");
		
		woodpecker.start();
		
		ClickerPanel.clicks = woodpecker.payPointsWood(ClickerPanel.clicks);
	    	}
	    	else {
	    		TimerPanel.eventLabel.setForeground(Color.RED);
	    		TimerPanel.eventLabel.setText("You can't afford the Woodpecker");
	    	}
	    }
	};
	
	public static int getClicks()
	{
		return itemClick;
	}
	
	
	public ItemPanelTwo() {
		
		// Panel settings
		setBounds(259,195,261,170); 	    
	    setLayout(new GridBagLayout());
	    setBorder(BorderFactory.createLineBorder(Color.black));
	    
	    // Show image
	    try 
	    {                
	       toolImgOne = ImageIO.read(new URL("https://i.imgur.com/m2v2aoA.png"));
	       
	    } 
	    catch (IOException ex) 
	    {
	       // handle exception...
	    }
	    addMouseListener(clickListener);
	}
	
	// Image settings
		@Override
	    protected void paintComponent(Graphics g) 
		{
	        super.paintComponent(g);
	        g.drawImage(toolImgOne, 1, 15, this); // see javadoc for more info on the parameters    
	        
	    }
}
