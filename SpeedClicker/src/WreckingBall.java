import java.util.Timer;
import java.util.TimerTask;

public class WreckingBall extends Shop {

	// Set value points
	int points = 100;

	// Create Timer and timerTask for Woodpecker
	static Timer wreckTimer;
	static TimerTask wreckTask;

	void start() {

		// Giving TimerTask a task
		wreckTask = new TimerTask() {

			public void run() {

				// Adding points to clicks
				ClickerPanel.clicks += points;
				TimerPanel.clickLabel.setText("Total clicks: " + ClickerPanel.clicks);

			}
		};
		// Giving Timer a task and an interval
		wreckTimer = new Timer();
		wreckTimer.scheduleAtFixedRate(wreckTask, 0, 5000);

	}

	// Method for paying
	public int payPointsWreck(int playerPoints) {
		playerPoints -= 200;
		return playerPoints;
	}

}
