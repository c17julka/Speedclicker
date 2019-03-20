import java.util.Timer;
import java.util.TimerTask;

public class Sledgehammer extends Shop {
	int points = 3;
	
	int pointCounter = 0;
	Timer sledgeTimer = new Timer();
	TimerTask sledgeTask = new TimerTask() {

		
		public void run() {
			pointCounter += points;
			System.out.println(" new Sp " + pointCounter);
			
		}};
	
		 void start() {
			sledgeTimer.scheduleAtFixedRate(sledgeTask, 0, 4000);
	
		}
	
		public int payPointsSledge (int playerPoints) {
			playerPoints -= 50;
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
