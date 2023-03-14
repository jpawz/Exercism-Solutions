public class CarsAssemble {
	private static final int CARS_PER_HOUR_AT_ONE_SPEED = 221;

	public double productionRatePerHour(int speed) {
		double successRate;
		if (speed == 0) {
			successRate = 0;
		} else if (speed > 0 && speed <= 4) {
			successRate = 1;
		} else if (speed >= 5 && speed <= 8) {
			successRate = 0.9;
		} else if (speed == 9) {
			successRate = 0.8;
		} else if (speed == 10) {
			successRate = 0.77;
		} else {
			throw new IllegalArgumentException("Wrong speed");
		}

		return speed * CARS_PER_HOUR_AT_ONE_SPEED * successRate;
	}

	public int workingItemsPerMinute(int speed) {
		return (int) productionRatePerHour(speed) / 60;
	}
}
