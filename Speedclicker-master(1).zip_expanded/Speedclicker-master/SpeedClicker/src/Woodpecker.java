import java.util.Timer;
import java.util.TimerTask;

public class Woodpecker extends Shop {
	
	
	int points = 1;
	int pointCounter = 0;
	
	Timer woodTimer = new Timer();
	TimerTask woodTask = new TimerTask() {

		
		public void run() {
			pointCounter += points;
			System.out.println(" new Wp " + pointCounter);
			
		}};
		
		public void start() {
			woodTimer.scheduleAtFixedRate(woodTask, 0, 3000);
		}
	
		public int payPointsWood (int playerPoints) {
			playerPoints -= 20;
			return playerPoints;
		}
		
		public int timeScore(int playerPoints) {
			 playerPoints += pointCounter;
			 return playerPoints;
		}
		
		public int getScore() {
			System.out.println("Fuuuk");
			return pointCounter;
		}
	
		
		public int getPoints() {
			return points;
		}
}
