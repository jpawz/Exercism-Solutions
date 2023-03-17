class NeedForSpeed {
	private int speed;
	private int battery;
	private int batteryDrain;
	private int distance;

	public NeedForSpeed(int speed, int batteryDrain) {
		this.speed = speed;
		this.batteryDrain = batteryDrain;
		this.distance = 0;
		this.battery = 100;
	}

	public boolean batteryDrained() {
		return battery == 0;
	}

	public int distanceDriven() {
		return distance;
	}

	public void drive() {
		if (batteryDrained()) {
			return;
		}

		if (isEnoughBatteryForDrive()) {
			distance += speed;
			battery -= batteryDrain;
		} else {
			calculatePartialDrive();
		}
	}

	public static NeedForSpeed nitro() {
		return new NeedForSpeed(50, 4);
	}

	private boolean isEnoughBatteryForDrive() {
		return battery - batteryDrain >= 0;
	}

	private void calculatePartialDrive() {
		battery = 0;
		distance = battery * speed / batteryDrain;
	}
}

class RaceTrack {
	private int distance;

	public RaceTrack(int distance) {
		this.distance = distance;
	}

	public boolean tryFinishTrack(NeedForSpeed car) {
		throw new UnsupportedOperationException("Please implement the RaceTrack.tryFinishTrack() method");
	}
}
