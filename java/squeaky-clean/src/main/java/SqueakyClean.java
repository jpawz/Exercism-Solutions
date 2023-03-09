import java.util.regex.Pattern;

class SqueakyClean {
	static String clean(String identifier) {
		String withoutSpaces = identifier.replace(" ", "_");
		String withoutControlCharacters = withoutSpaces.replaceAll("\\p{Cc}", "CTRL");
		String camelCaseString = Pattern.compile("-(.)").matcher(withoutControlCharacters)
				.replaceAll(mr -> mr.group(1).toUpperCase());
		String withoutDigitsAndGreekLowerCaseLetters = camelCaseString.replaceAll("[0-9α-ω]", "");
		String onlyLetters = withoutDigitsAndGreekLowerCaseLetters.replaceAll("[^\\p{IsAlphabetic}\\p{IsDigit}_]", "");
		return onlyLetters;
	}
}
