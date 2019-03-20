import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ShopHeaderPanel extends JPanel
{
	public ShopHeaderPanel()
	{
		// Panel settings
		setBounds(259,-1,261,41);
		setLayout(new GridBagLayout());
	    setBorder(BorderFactory.createLineBorder(Color.black));
	    
	    // Create label + set font
	    JLabel shopLabel = new JLabel("Shop");
	    shopLabel.setFont(new Font("Raleway", Font.BOLD, 20));
	    
	    // Add components to panel
	    GridBagConstraints gbc = new GridBagConstraints();
	    
	    gbc.weightx = 1;
		gbc.weighty = 1;
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		add(shopLabel, gbc);
	}
}
