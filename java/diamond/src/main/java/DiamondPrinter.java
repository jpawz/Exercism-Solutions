import java.util.List;
import java.util.stream.IntStream;

class DiamondPrinter {

	List<String> printToList(char a) {
		int diamondSize = (a - 'A') * 2 + 1;
		int halfOfDiamondSize = diamondSize / 2;

		return IntStream.range(0, diamondSize)
				.mapToObj(c -> {
					var sb = new StringBuilder(" ".repeat(diamondSize));
					int leftCharIndex = Math.abs(halfOfDiamondSize - c);
					int rightCharIndex = diamondSize - leftCharIndex - 1;
					char currentChar = (char) (a - leftCharIndex);
					sb.setCharAt(leftCharIndex, currentChar);
					sb.setCharAt(rightCharIndex, currentChar);
					return sb.toString();
				})
				.toList();
	}

}
