import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

class WordCount {
    private static final Pattern pattern = Pattern.compile("(?!'.*')\\b[\\w']+\\b");
    
    public Map<String, Integer> phrase(String input) {
	return pattern.matcher(input.toLowerCase()).results()
		      .collect(Collectors.toMap(mr -> mr.group(), mr -> 1, Integer::sum));
    }
}
