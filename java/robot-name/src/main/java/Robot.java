import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

class Robot {
	private static int counter = 0;
	private final static List<String> nameLibrary;

	private String name;

	static {
		nameLibrary = new ArrayList<>();
		IntStream.range(0, 1000)
				.boxed()
				.forEach(number -> IntStream.rangeClosed('A', 'Z')
						.boxed()
						.forEach(firsChar -> IntStream.rangeClosed('A', 'Z')
								.boxed()
								.forEach(
										secondChar -> nameLibrary.add(
												String.format("%c%c%03d", firsChar,
														secondChar, number)))));
		Collections.shuffle(nameLibrary);
	}

	Robot() {
		name = nameLibrary.get(counter++);
	}

	String getName() {
		return name;
	}

	void reset() {
		name = nameLibrary.get(counter++);
	}
}