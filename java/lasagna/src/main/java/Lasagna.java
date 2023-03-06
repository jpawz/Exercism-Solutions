public class Lasagna {
	private static final int COOKING_TIME_IN_MINUTES = 40;
	private static final int MINUTES_PREPARATION_PER_LAYER = 2;

	/**
	 * Gives the cooking time of the lasagna.
	 * 
	 * @return time in minutes to cook the lasagna.
	 */
	public int expectedMinutesInOven() {
		return COOKING_TIME_IN_MINUTES;
	}

	/**
	 * Calculates the remaining time to cook the lasagna.
	 * 
	 * @param actualMinutesInOven how many minutes is the lasagna currently cooking.
	 * @return remaining time in minutes to cook the lasagna.
	 */
	public int remainingMinutesInOven(int actualMinutesInOven) {
		return expectedMinutesInOven() - actualMinutesInOven;
	}

	/**
	 * Calculates preparation time in minutes of lasagna based on number of layers.
	 * 
	 * @param numberOfLayers
	 * @return preparation time in minutes of the lasagna.
	 */
	public int preparationTimeInMinutes(int numberOfLayers) {
		return numberOfLayers * MINUTES_PREPARATION_PER_LAYER;
	}

	/**
	 * Calculates total preparation time of lasagna.
	 * 
	 * @param numberOfLayers
	 * @param actualMinutesInOven
	 * @return time in minutes.
	 */
	public int totalTimeInMinutes(int numberOfLayers, int actualMinutesInOven) {
		return preparationTimeInMinutes(numberOfLayers) + actualMinutesInOven;
	}
}
