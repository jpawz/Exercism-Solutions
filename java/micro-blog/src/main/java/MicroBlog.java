import java.util.stream.IntStream;

class MicroBlog {
	public String truncate(String input) {
		if (input.length() <= 5)
			return input;

		int lastIndex = IntStream.range(0, input.length())
				.filter(i -> input.codePointCount(0, i + 1) > 5)
				.findFirst()
				.orElse(input.length());

		return input.substring(0, lastIndex);
	}
}
