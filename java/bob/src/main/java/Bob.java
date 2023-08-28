import static java.util.function.Predicate.not;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

class Bob {

	private static final Map<Predicate<String>, String> RESPONSES = new HashMap<>();
	private static final Predicate<String> isQuestion = s -> s.trim().endsWith("?");
	private static final Predicate<String> isYell = s -> s.equals(s.toUpperCase()) && !s.equals(s.toLowerCase());
	private static final Predicate<String> isYellQuestion = isYell.and(isQuestion);
	private static final Predicate<String> isSilence = s -> s.isBlank();

	private static final String defaultAnswer = "Whatever.";

	static {
		RESPONSES.put(isQuestion.and(not(isYell)), "Sure.");
		RESPONSES.put(isYell.and(not(isQuestion)), "Whoa, chill out!");
		RESPONSES.put(isYellQuestion, "Calm down, I know what I'm doing!");
		RESPONSES.put(isSilence, "Fine. Be that way!");
	}

	public String hey(String request) {
		return RESPONSES.entrySet()
				.stream()
				.filter(entry -> entry.getKey()
						.test(request))
				.map(entry -> entry.getValue())
				.findFirst()
				.orElse(defaultAnswer);
	}

}
