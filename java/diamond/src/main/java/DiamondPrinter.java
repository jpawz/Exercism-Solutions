import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class DiamondPrinter {

	List<String> printToList(char a) {
		if (a == 'A') {
			return List.of("A");
		}

		int lineLength = (a - 'A') * 2 + 1;

		StringBuilder firstLine = new StringBuilder(" ".repeat(lineLength));
		firstLine.setCharAt(lineLength / 2, 'A');

		List<String> middleRows = IntStream.range('B', a)
				.mapToObj(c -> {
					StringBuilder sb = new StringBuilder(" ".repeat(lineLength));
					sb.setCharAt((lineLength / 2) - (c - 'A'), (char) c);
					sb.setCharAt((lineLength / 2) + (c - 'A'), (char) c);
					return sb.toString();
				})
				.collect(Collectors.toList());

		StringBuilder middleLine = new StringBuilder(" ".repeat(lineLength));
		middleLine.setCharAt(0, a);
		middleLine.setCharAt(lineLength - 1, a);

		List<String> diamond = new ArrayList<>();
		diamond.add(firstLine.toString());
		diamond.addAll(middleRows);
		diamond.add(middleLine.toString());
		Collections.reverse(middleRows);
		diamond.addAll(middleRows);
		diamond.add(firstLine.toString());
		return diamond;
	}

}
