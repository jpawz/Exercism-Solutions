public class ExperimentalRemoteControlCar implements RemoteControlCar {
	private int speed = 20;
	private int distance = 0;

	@Override
	public void drive() {
		distance = distance + speed;
	}

	@Override
	public int getDistanceTravelled() {
		return distance;
	}
}
