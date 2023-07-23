import java.util.Arrays;
import java.util.List;

class Proverb {

	private static final List<String> PROVERBS = List.of(
			"And all for the want of a nail.",
			"For want of a battle the kingdom was lost.",
			"For want of a message the battle was lost.",
			"For want of a rider the message was lost.",
			"For want of a horse the rider was lost.",
			"For want of a shoe the horse was lost.",
			"For want of a nail the shoe was lost.");
	private final List<String> words;

	Proverb(String[] words) {
		this.words = Arrays.asList(words);
	}

	String recite() {
		return PROVERBS.stream()
				.filter(proverb -> words.stream()
						.anyMatch(w -> proverb.contains(w)))
				.findFirst()
				.orElse("");
//				.collect(Collectors.joining("\n"));
	}

}
