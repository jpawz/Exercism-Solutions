public class ElonsToyCar {
	private int distance = 0;
	private int batteryCharge = 100;

	public static ElonsToyCar buy() {
		return new ElonsToyCar();
	}

	public String distanceDisplay() {
		return "Driven " + distance + " meters";
	}

	public String batteryDisplay() {
		return "Battery at " + batteryCharge + "%";
	}

	public void drive() {
		distance += 20;
		batteryCharge -= 1;
	}
}
