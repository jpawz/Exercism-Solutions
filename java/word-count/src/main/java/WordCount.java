import java.util.Collections;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.function.Function;
import java.util.stream.Collectors;

class WordCount {
    public Map<String, Integer> phrase(String input) {
	return Collections.list(new StringTokenizer(input.toLowerCase(), ",!&@$%^&: \n")).stream()
			  .map(t -> (String) t)
			  .collect(Collectors.toMap(
			      Function.identity(),
			      s -> 1,
			      Integer::sum));
    }
}
