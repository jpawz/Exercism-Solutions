import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Proverb {

	private final List<String> words;

	Proverb(String[] words) {
		this.words = Arrays.asList(words);
	}

	String recite() {
		if (words.size() == 0)
			return "";
		return IntStream.range(1, words.size())
				.boxed()
				.map(n -> String.format("For want of a %s the %s was lost.", words.get(n - 1), words.get(n)))
				.collect(Collectors.joining("\n"))
				.concat(String.format("\nAnd all for the want of a %s.", words.get(0)))
				.strip();
	}

}
