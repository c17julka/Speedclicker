import java.util.Timer;
import java.util.TimerTask;

public class WreckingBall extends Shop {
	int points = 100;

	static Timer wreckTimer;
	static TimerTask wreckTask;

	void start() {

		wreckTask = new TimerTask() {

			public void run() {

				ClickerPanel.clicks += points;
				TimerPanel.clickLabel.setText("Total clicks: " + ClickerPanel.clicks);

			}
		};
		wreckTimer = new Timer();
		wreckTimer.scheduleAtFixedRate(wreckTask, 0, 5000);

	}

	public int payPointsWreck(int playerPoints) {
		playerPoints -= 200;
		return playerPoints;
	}

	public int getPoints() {
		return points;
	}

}
