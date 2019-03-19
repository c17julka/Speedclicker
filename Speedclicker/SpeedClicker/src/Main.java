import java.io.IOException;


import javax.swing.JFrame;

public class Main 
{

	public static void main(String[] args)
	{
		JFrame frame = new Frame("Speedclicker");
		
		ShopItemTimer time = new ShopItemTimer();
		time.start();
		
		
		Sledgehammer hh = new Sledgehammer();
		Woodpecker hj = new Woodpecker();
		
		int y = 10;
		
		hh.start(y);
		hj.start();
		
		System.out.println(hh.pointCounter + "it is?");
	}

}
