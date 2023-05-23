import java.util.function.IntPredicate;

class IsogramChecker {
	private final IntPredicate isNotSpaceOrHyphen = c -> c != ' ' || c != '-';

	boolean isIsogram(String phrase) {
		long uniqueCharactersCount = phrase.chars()
				.filter(isNotSpaceOrHyphen)
				.distinct()
				.count();

		long charactersCount = phrase.chars()
				.filter(isNotSpaceOrHyphen)
				.count();

		return charactersCount == uniqueCharactersCount;
	}

}
