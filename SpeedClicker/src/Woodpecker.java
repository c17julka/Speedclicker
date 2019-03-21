import java.util.Timer;
import java.util.TimerTask;

public class Woodpecker extends Shop {

	int points = 2;

	static Timer woodTimer;
	static TimerTask woodTask;

	void start() {

		woodTask = new TimerTask() {

			public void run() {

				ClickerPanel.clicks += points;
				TimerPanel.clickLabel.setText("Total clicks: " + ClickerPanel.clicks);

			}
		};
		woodTimer = new Timer();
		woodTimer.scheduleAtFixedRate(woodTask, 0, 2000);

	}

	public int payPointsWood(int playerPoints) {
		playerPoints -= 10;
		return playerPoints;
	}

	public int getPoints() {
		return points;
	}
}
