import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class ClickerPanel extends JPanel
{
	private BufferedImage clickerImage;
	static int clicks = 0;
	
	// Mouse listener for detecting clicks on panel (image)
	private MouseAdapter clickListener = new MouseAdapter() 
	{
	    public void mouseClicked(MouseEvent e) 
	    {
	    	clicks++;
	    	System.out.println(clicks);
	    }
	};
	
	public static int getClicks()
	{
		return clicks;
	}
	
	public ClickerPanel() 
	{	
		
		// Panel settings
		setBounds(0,100,260,300);   	    
	    setLayout(new GridBagLayout());
	    setBorder(BorderFactory.createLineBorder(Color.black));
	    
	    // Show image
	    try 
	    {                
	       clickerImage = ImageIO.read(new URL("https://i.imgur.com/si9MGVP.png"));
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
        g.drawImage(clickerImage, 1, 15, this); // see javadoc for more info on the parameters            
    }
}
