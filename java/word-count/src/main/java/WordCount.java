import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

class WordCount {
    public Map<String, Integer> phrase(String input) {
	Pattern pattern = Pattern.compile("(?!'.*')\\b[\\w']+\\b");
	return pattern.matcher(input.toLowerCase()).results()
		      .collect(Collectors.toMap(mr -> mr.group(), mr -> 1, Integer::sum));
    }
}
