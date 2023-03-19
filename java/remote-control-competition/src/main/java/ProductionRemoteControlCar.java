class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
	private int speed = 10;
	private int distance = 0;
	private int numberOfVictories = 0;

	@Override
	public void drive() {
		distance = distance + speed;
	}

	@Override
	public int getDistanceTravelled() {
		return distance;
	}

	public int getNumberOfVictories() {
		return numberOfVictories;
	}

	public void setNumberOfVictories(int numberOfVictories) {
		this.numberOfVictories = numberOfVictories;
	}

	@Override
	public int compareTo(ProductionRemoteControlCar o) {
		return Integer.compare(getNumberOfVictories(), o.getNumberOfVictories());
	}
}
