import java.util.stream.Collectors;
import java.util.stream.IntStream;

class TwelveDays {

	private static String begin = "On the %s day of Christmas my true love gave to me: %sa Partridge in a Pear Tree.\n";

	private static String[] ordinals = {
			"first",
			"second",
			"third",
			"fourth",
			"fifth",
			"sixth",
			"seventh",
			"eighth",
			"ninth",
			"tenth",
			"eleventh",
			"twelfth"
	};

	private static String[] parts = {
			"two Turtle Doves",
			"three French Hens",
			"four Calling Birds",
			"five Gold Rings",
			"six Geese-a-Laying",
			"seven Swans-a-Swimming",
			"eight Maids-a-Milking",
			"nine Ladies Dancing",
			"ten Lords-a-Leaping",
			"eleven Pipers Piping",
			"twelve Drummers Drumming" };

	String verse(int verseNumber) {
		String end = "";
		if (verseNumber > 1) {
			end = IntStream.range(0, verseNumber - 1)
					.mapToObj(i -> parts[verseNumber - i - 2])
					.collect(Collectors.joining(", ", "", ", and "));
		}

		return String.format(begin, ordinals[verseNumber - 1], end);
	}

	String verses(int startVerse, int endVerse) {
		throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
	}

	String sing() {
		throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
	}
}
