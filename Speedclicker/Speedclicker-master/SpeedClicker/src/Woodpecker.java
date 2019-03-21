import java.util.Timer;
import java.util.TimerTask;

public class Woodpecker extends Shop {

	// Set value points
	int points = 2;

	// Create Timer and timerTask for Woodpecker
	static Timer woodTimer;
	static TimerTask woodTask;

	void start() {

		// Giving TimerTask a task
		woodTask = new TimerTask() {

			public void run() {

				// Adding points to clicks
				ClickerPanel.clicks += points;
				TimerPanel.clickLabel.setText("Total clicks: " + ClickerPanel.clicks);

			}
		};
		// Giving Timer a task and an interval
		woodTimer = new Timer();
		woodTimer.scheduleAtFixedRate(woodTask, 0, 2000);

	}

	// Method for paying
	public int payPointsWood(int playerPoints) {
		playerPoints -= 10;
		return playerPoints;
	}

}
