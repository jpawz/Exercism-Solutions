import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LanguageList {
	private final List<String> languages = new ArrayList<>();

	public boolean isEmpty() {
		return languages.isEmpty();
	}

	public void addLanguage(String language) {
		languages.add(language);
	}

	public void removeLanguage(String language) {
		languages.remove(language);
	}

	public String firstLanguage() {
		if (languages.size() > 0) {
			return languages.get(0);
		}
		return "";
	}

	public int count() {
		return languages.size();
	}

	public boolean containsLanguage(String language) {
		return languages.contains(language);
	}

	public boolean isExciting() {
		Predicate<String> isJavaOrKotlin = language -> language == "Java" || language == "Kotlin";
		return languages.stream()
				.anyMatch(isJavaOrKotlin);
	}
}
