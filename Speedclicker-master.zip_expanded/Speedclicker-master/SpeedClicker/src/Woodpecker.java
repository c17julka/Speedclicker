import java.util.Timer;
import java.util.TimerTask;

public class Woodpecker extends Shop {

	int points = 1;

	Timer woodTimer = new Timer();
	TimerTask woodTask = new TimerTask() {

		public void run() {
			ClickerPanel.clicks += points;
			TimerPanel.clickLabel.setText("Total clicks: " + ClickerPanel.clicks);

		}
	};

	public void start() {
		woodTimer.scheduleAtFixedRate(woodTask, 0, 1000);
	}

	public int payPointsWood(int playerPoints) {
		playerPoints -= 25;
		return playerPoints;
	}

	public int getPoints() {
		return points;
	}
}
