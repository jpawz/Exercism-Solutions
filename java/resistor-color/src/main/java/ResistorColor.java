import java.util.List;

class ResistorColor {
	private static final List<String> RESISTORS = List.of("black", "brown", "red", "orange", "yellow", "green", "blue",
			"violet", "grey", "white");

	int colorCode(String color) {
		return RESISTORS.indexOf(color);
	}

	String[] colors() {
		return RESISTORS.toArray(new String[RESISTORS.size()]);
	}
}
