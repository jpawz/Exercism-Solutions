class PigLatinTranslator {

	private static final String VOWEL = "aeiouAEIOU";

	public String translate(String word) {
		if (isVowel(word.charAt(0)))
			return word + "ay";
		else if (!isVowel(word.charAt(0)) && "qu".equals(word.substring(1, 3)))
			return word.substring(3) + word.substring(0, 3) + "ay";
		else
			return word.substring(firstVowelIndex(word)) + word.substring(0, firstVowelIndex(word)) + "ay";
	}

	private static boolean isVowel(char c) {
		return VOWEL.indexOf(c) != -1;
	}

	private static int firstVowelIndex(String word) {
		int vowelIndex = 0;

		while (!isVowel(word.charAt(vowelIndex))) {
			vowelIndex++;
		}
		;
		return vowelIndex;
	}

}