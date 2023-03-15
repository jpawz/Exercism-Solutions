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
		if (batteryCharge == 0) {
			return "Battery empty";
		} else {
			return "Battery at " + batteryCharge + "%";
		}
	}

	public void drive() {
		if (batteryCharge == 0)
			return;

		distance += 20;
		batteryCharge -= 1;
	}
}
