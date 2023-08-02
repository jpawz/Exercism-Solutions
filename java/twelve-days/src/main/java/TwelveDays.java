class TwelveDays {

	private static String begin = "On the first day of Christmas my true love gave to me: ";

	private static String[] parts = { "twelve Drummers Drumming", "eleven Pipers Piping", "ten Lords-a-Leaping",
			"nine Ladies Dancing",
			"eight Maids-a-Milking", "seven Swans-a-Swimming", "six Geese-a-Laying", "five Gold Rings",
			"four Calling Birds", "three French Hens", "two Turtle Doves", "a Partridge in a Pear Tree" };

	String verse(int verseNumber) {
		return begin + parts[parts.length - verseNumber] + ".\n";
	}

	String verses(int startVerse, int endVerse) {
		throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
	}

	String sing() {
		throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
	}
}
