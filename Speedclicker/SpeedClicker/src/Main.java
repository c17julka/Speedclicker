import java.io.IOException;


import javax.swing.JFrame;

public class Main 
{

	public static void main(String[] args)
	{
		JFrame frame = new Frame("Speedclicker");
		
		ShopItemTimer time = new ShopItemTimer();
		time.start();
		
			int y = 0;
			int yy = 100;
			
		Sledgehammer slg = new Sledgehammer();
		Woodpecker wpr = new Woodpecker();
			
			wpr.start();
			slg.start();

	}

}
