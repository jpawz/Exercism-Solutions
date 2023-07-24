import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Proverb {

	private final String[] words;

	Proverb(String[] words) {
		this.words = words;
	}

	String recite() {
		if (words.length == 0)
			return "";
		return IntStream.range(0, words.length - 1)
				.mapToObj(n -> String.format("For want of a %s the %s was lost.", words[n], words[n + 1]))
				.collect(Collectors.joining("\n"))
				.concat(String.format("\nAnd all for the want of a %s.", words[0]))
				.strip();
	}

}
