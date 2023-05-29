import java.util.Arrays;
import java.util.List;

class Anagram {
	private final String wordInLowercase;
	private char[] wordAsSortedArray;

	public Anagram(String word) {
		this.wordInLowercase = word.toLowerCase();
		this.wordAsSortedArray = wordInLowercase.toLowerCase()
				.toCharArray();
		Arrays.sort(wordAsSortedArray);
	}

	public List<String> match(List<String> wordList) {
		return wordList.stream()
				.filter(w -> isAnagram(w.toLowerCase()))
				.toList();
	}

	private boolean isAnagram(String word) {
		if (this.wordInLowercase.equals(word))
			return false;

		char[] charArray = word.toCharArray();
		Arrays.sort(charArray);
		return Arrays.equals(wordAsSortedArray, charArray);
	}

}