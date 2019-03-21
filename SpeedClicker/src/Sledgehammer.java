import java.util.Timer;
import java.util.TimerTask;

public class Sledgehammer extends Shop {

	// Set value points
	int points = 10;

	// Create Timer and timerTask for Woodpecker
	static Timer sledgeTimer;
	static TimerTask sledgeTask;

	void start() {

		// Giving TimerTask a task
		sledgeTask = new TimerTask() {

			public void run() {

				// Adding points to clicks
				ClickerPanel.clicks += points;
				TimerPanel.clickLabel.setText("Total clicks: " + ClickerPanel.clicks);

			}
		};
		// Giving Timer a task and an interval
		sledgeTimer = new Timer();
		sledgeTimer.scheduleAtFixedRate(sledgeTask, 0, 2000);

	}

	// Method for paying
	public int payPointsSledge(int playerPoints) {
		playerPoints -= 25;
		return playerPoints;
	}

}
