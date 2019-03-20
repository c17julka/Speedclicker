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
	    	
	    	if (itemClick == 1) {
	    		
	    		// change img (?)
	    		System.out.print("Bought ");
	    		// Create Woodpecker
		Woodpecker woodpecker = new Woodpecker();
		woodpecker.setItemName("Woodpecker ");
		woodpecker.setPrice(30);
		System.out.println("New Woodpecker");
		woodpecker.start();
		
		//sledgehammer.payPointsSledge(playerPoints);
	    	}
	    	else {
	    		System.out.print("Already bought");
	    		System.out.println(" The Woodpecker");
	    	}
	    }
	};
	
	public static int getClicks()
	{
		return itemClick;
	}
	
	
	public ItemPanelTwo() {
		
		// Panel settings
		setBounds(259,198,261,202);   	    
	    setLayout(new GridBagLayout());
	    setBorder(BorderFactory.createLineBorder(Color.black));
	    
	    // Show image
	    try 
	    {                
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
