import java.util.Timer;
import java.util.TimerTask;

public class Sledgehammer extends Shop {
	int points = 10;

	static Timer sledgeTimer;
	static TimerTask sledgeTask;

	void start() {

		sledgeTask = new TimerTask() {

			public void run() {

				ClickerPanel.clicks += points;
				TimerPanel.clickLabel.setText("Total clicks: " + ClickerPanel.clicks);

			}
		};
		sledgeTimer = new Timer();
		sledgeTimer.scheduleAtFixedRate(sledgeTask, 0, 2000);

	}

	public int payPointsSledge(int playerPoints) {
		playerPoints -= 25;
		return playerPoints;
	}

	public int getPoints() {
		return points;
	}

}
