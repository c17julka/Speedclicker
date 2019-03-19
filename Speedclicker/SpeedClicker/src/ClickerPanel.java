import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class ClickerPanel extends JPanel
{
	private BufferedImage image;
	
	public ClickerPanel() 
	{	
		// Panel settings
		setBounds(0,100,260,300);   	    
	    setLayout(new GridBagLayout());
	    setBorder(BorderFactory.createLineBorder(Color.black));
	    
	    // Show image
	    try 
	    {                
	       image = ImageIO.read(new URL("https://i.imgur.com/si9MGVP.png"));
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
        g.drawImage(image, 1, 15, this); // see javadoc for more info on the parameters            
    }
}
