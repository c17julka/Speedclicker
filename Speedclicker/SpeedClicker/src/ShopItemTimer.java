import java.util.Timer;
import java.util.TimerTask;


// Change everything ere
public class ShopItemTimer {
	
	static int sekPassed = 0;
	 Timer itemTimer = new Timer();
	 TimerTask itemTask = new TimerTask() {

		public void run() {
		sekPassed++;
		System.out.println("Sekunder " + sekPassed);
		
	}
		 
	 }; 
	 public void start() {
		 itemTimer.scheduleAtFixedRate(itemTask, 0, 1000);
	 }
	 
	


	
}
