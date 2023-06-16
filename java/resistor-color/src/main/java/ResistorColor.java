import java.util.Map;

class ResistorColor {
	private static final Map<String, Integer> RESISTORS = Map.of("black", 0, "brown", 1, "red", 2, "orange", 3,
			"yellow", 4, "green", 5, "blue", 6, "violet", 7, "grey", 8, "white", 9);

	int colorCode(String color) {
		return RESISTORS.get(color);
	}

	String[] colors() {
		throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
	}
}
