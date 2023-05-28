class PigLatinTranslator {

	private static final String VOWEL = "aeiouAEIOU";

	public String translate(String word) {
		if (isVowel(word.charAt(0)))
			return word + "ay";
		else
			return word.substring(1) + word.charAt(0) + "ay";
	}

	private static boolean isVowel(char c) {
		return VOWEL.indexOf(c) != -1;
	}

}