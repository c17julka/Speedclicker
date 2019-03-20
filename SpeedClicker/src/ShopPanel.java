import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class ShopPanel extends JPanel{
	
	private BufferedImage toolImgOne;
	private BufferedImage toolImgTwo;
	
	public ShopPanel() {
		
		// Panel settings
		setBounds(259,-1,261,400);   	    
	    setLayout(new GridBagLayout());
	    setBorder(BorderFactory.createLineBorder(Color.black));
	    
	    // Show image
	    try 
	    {                
	       toolImgOne = ImageIO.read(new URL("https://i.imgur.com/si9MGVP.png"));
	       toolImgTwo = ImageIO.read(new URL("https://i.imgur.com/si9MGVP.png"));
	    } 
	    catch (IOException ex) 
	    {
	       // handle exception...
	    }
	    
	}
	
	// Image settings
		@Override
	    protected void paintComponent(Graphics g) 
		{
	        super.paintComponent(g);
	        g.drawImage(toolImgOne, 1, 15, this); // see javadoc for more info on the parameters    
	        g.drawImage(toolImgTwo, 10, 15, this); // see javadoc for more info on the parameters    
	    }
		
		
	   
	
}
