import java.util.Arrays;
import java.util.stream.Collectors;

class PigLatinTranslator {

	private static final String VOWEL = "aeiouAEIOU";

	public String translate(String phraze) {
		return Arrays.stream(phraze.split(" "))
				.map(PigLatinTranslator::translateWord)
				.collect(Collectors.joining(" "));
	}

	private static String translateWord(String word) {
		if (isVowel(word.charAt(0)) || "xr".equals(word.substring(0, 2)) || "yt".equals(word.substring(0, 2)))
			return word + "ay";
		else if ("qu".equals(word.substring(0, 2)))
			return word.substring(2) + word.substring(0, 2) + "ay";
		else if (word.length() > 2 && !isVowel(word.charAt(0)) && "qu".equals(word.substring(1, 3)))
			return word.substring(3) + word.substring(0, 3) + "ay";
		else if (word.indexOf('y') > 0 && word.indexOf('y') < firstVowelIndex(word))
			return word.substring(word.indexOf('y')) + word.substring(0, word.indexOf('y')) + "ay";
		else
			return word.substring(firstVowelIndex(word)) + word.substring(0, firstVowelIndex(word)) + "ay";
	}

	private static boolean isVowel(char c) {
		return VOWEL.indexOf(c) != -1;
	}

	private static int firstVowelIndex(String word) {
		int vowelIndex = 0;

		while (vowelIndex < word.length() && !isVowel(word.charAt(vowelIndex))) {
			vowelIndex++;
		}
		return vowelIndex;
	}

}