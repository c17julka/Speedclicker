import java.util.Timer;
import java.util.TimerTask;

public class Sledgehammer extends Shop {
	int points = 3;
	int pointCounter = 0;
	
	
	static Timer sledgeTimer;
	static TimerTask sledgeTask;
	
	
		 void start() {
			 
			sledgeTask = new TimerTask() {

		
		public void run() {
			
			ClickerPanel.clicks += points;
			TimerPanel.clickLabel.setText("Total clicks: " + ClickerPanel.clicks);

		}}; 
			sledgeTimer = new Timer();
			sledgeTimer.scheduleAtFixedRate(sledgeTask, 0, 4000);
	
		}
	
		public int payPointsSledge (int playerPoints) {
			playerPoints = playerPoints - 50;
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
