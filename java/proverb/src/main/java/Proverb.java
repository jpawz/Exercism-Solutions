import java.util.Arrays;
import java.util.List;

class Proverb {

	private final List<String> words;

	Proverb(String[] words) {
		this.words = Arrays.asList(words);
	}

	String recite() {
		if (words.size() == 0)
			return "";
		var sb = new StringBuilder();
		for (int i = 1; i < words.size(); i++) {
			sb.append("For want of a ");
			sb.append(words.get(i - 1));
			sb.append(" the ");
			sb.append(words.get(i));
			sb.append(" was lost.");
		}
		sb.append("\nAnd all for the want of a ");
		sb.append(words.get(0));
		sb.append(".");
		return sb.toString()
				.strip();
	}

}
