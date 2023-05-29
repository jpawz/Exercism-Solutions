import java.util.Arrays;
import java.util.List;

class Anagram {
	private final String wordInLowercase;
	private char[] wordAsSortedArray;

	public Anagram(String word) {
		this.wordInLowercase = word.toLowerCase();
		this.wordAsSortedArray = word.toLowerCase()
				.toCharArray();
		Arrays.sort(wordAsSortedArray);
	}

	public List<String> match(List<String> wordList) {
		return wordList.stream()
				.filter(w -> isAnagram(w))
				.toList();
	}

	private boolean isAnagram(String word) {
		if (this.wordInLowercase.equals(word.toLowerCase()))
			return false;

		char[] charArray = word.toLowerCase()
				.toCharArray();
		Arrays.sort(charArray);
		return Arrays.equals(wordAsSortedArray, charArray);
	}

}