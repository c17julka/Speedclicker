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
	static int itemClick = 0;
	// static int sledgeAmount = 0;
	Sledgehammer sledgehammer;
	// Boolean itemBuy = false; might not woork at allll
	
	private MouseAdapter clickListener = new MouseAdapter() 
	{
	    public void mouseClicked(MouseEvent e) 
	    {
	    	
	    	// Fix Points forplayer and stuff
	    	if (ClickerPanel.clicks >= 50) {
	    		sledgehammer = new Sledgehammer();
		sledgehammer.setItemName("Sledgehammer ");
		sledgehammer.setPrice(50);
		
		TimerPanel.eventLabel.setForeground(Color.BLUE);
		TimerPanel.eventLabel.setText("Bought new Sledgehammer!");
		
		sledgehammer.payPointsSledge(ClickerPanel.clicks);
	    	itemClick++;
	    	// sledgeAmount++;
	    	
//	    	if (itemClick == 1) {

//	    		// Create Sledgehammer
		sledgehammer.start();
		
		ClickerPanel.clicks = sledgehammer.payPointsSledge(ClickerPanel.clicks);
//	    	}
////	    	else {
////	    		System.out.print("Already bought");
////	    		System.out.println(" The Sledgehammer");
////	    	}
	    }
	    	else {
	    		TimerPanel.eventLabel.setForeground(Color.RED);
	    		TimerPanel.eventLabel.setText("You can't afford the Sledgehammer");
	    	}
	    }
	    
	};
	
	public static int getClicks()
	{
		return itemClick;
	}
	
	
	public ItemPanelOne() {
		
		// Panel settings
		setBounds(259,39,261,167);   	    
	    setLayout(new GridBagLayout());
	    setBorder(BorderFactory.createLineBorder(Color.black));
	    
	    // Show image
	    try 
	    {    // change this img for a free to use            
	       toolImgOne = ImageIO.read(new URL("https://i.pinimg.com/originals/84/80/0a/84800a51190797584c6f28c3141b9678.png"));
	       
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
