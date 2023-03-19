class ProductionRemoteControlCar implements RemoteControlCar {
	private int speed = 10;
	private int distance = 0;

	@Override
	public void drive() {
		distance = distance + speed;
	}

	@Override
	public int getDistanceTravelled() {
		return distance;
	}

	public int getNumberOfVictories() {
		throw new UnsupportedOperationException(
				"Please implement the ProductionRemoteControlCar.getNumberOfVictories() method");
	}

	public void setNumberOfVictories(int numberOfVictories) {
		throw new UnsupportedOperationException(
				"Please implement the ProductionRemoteControlCar.setNumberOfVictories() method");
	}
}
