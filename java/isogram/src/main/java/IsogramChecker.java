import java.util.function.IntPredicate;

class IsogramChecker {
	private final IntPredicate isNotSpaceOrHyphen = c -> c != ' ' || c != '-';

	boolean isIsogram(String phrase) {
		long uniqueCharactersCount = phrase.toLowerCase()
				.chars()
				.filter(isNotSpaceOrHyphen)
				.distinct()
				.count();

		long charactersCount = phrase.toLowerCase()
				.chars()
				.filter(isNotSpaceOrHyphen)
				.count();

		return charactersCount == uniqueCharactersCount;
	}

}
