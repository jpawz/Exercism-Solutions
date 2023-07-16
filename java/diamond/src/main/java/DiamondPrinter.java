import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class DiamondPrinter {

	List<String> printToList(char a) {
		int diamondSize = (a - 'A') * 2 + 1;
		int halfOfDiamondSize = diamondSize / 2;

		return IntStream.range(0, diamondSize)
				.mapToObj(c -> {
					StringBuilder sb = new StringBuilder(" ".repeat(diamondSize));
					int characterIndex = halfOfDiamondSize - c < 0 ? c - halfOfDiamondSize : halfOfDiamondSize - c;
					sb.setCharAt(characterIndex, (char) (a - characterIndex));
					sb.setCharAt(diamondSize - 1 - characterIndex, (char) (a - characterIndex));
					return sb.toString();
				})
				.collect(Collectors.toList());
	}

}
