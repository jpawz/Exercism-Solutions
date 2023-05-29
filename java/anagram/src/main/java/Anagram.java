import java.util.Arrays;
import java.util.List;

class Anagram {
	private char[] wordAsSortedArray;

	public Anagram(String word) {
		this.wordAsSortedArray = word.toCharArray();
		Arrays.sort(wordAsSortedArray);
	}

	public List<String> match(List<String> wordList) {
		return wordList.stream()
				.filter(w -> isAnagram(w))
				.toList();
	}

	private boolean isAnagram(String word) {
		char[] charArray = word.toCharArray();
		Arrays.sort(charArray);
		return Arrays.equals(wordAsSortedArray, charArray);
	}

}