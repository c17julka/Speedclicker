import java.util.Timer;
import java.util.TimerTask;

public class Woodpecker extends Shop {
	
	
	int points = 1;
	int pointCounter = 0;
	
	
	Timer woodTimer = new Timer();
	TimerTask woodTask = new TimerTask() {

		
		public void run() {
			ClickerPanel.clicks += points;
			TimerPanel.clickLabel.setText("Total clicks: " + ClickerPanel.clicks);
			
			
		}};
		
		public void start() {
			woodTimer.scheduleAtFixedRate(woodTask, 0, 3000);
		}
	
		public int payPointsWood (int playerPoints) {
			playerPoints -= 30;
			return playerPoints;
		}
		
		public int timeScore(int playerPoints) {
			 playerPoints += pointCounter;
			 return playerPoints;
		}
		
		public int getScore() {

			return pointCounter;
		}
	
		
		public int getPoints() {
			return points;
		}
}
