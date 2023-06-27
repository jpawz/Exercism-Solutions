import java.util.List;

class DiamondPrinter {

	List<String> printToList(char a) {
		if (a == 'A') {
			return List.of("A");
		}

		int lineLength = a - 'A' + 1;

		int leadingSpaces = lineLength / 2;
		String firstRow = String
				.format("%" + (leadingSpaces + 1) + "s%-" + (leadingSpaces - 1 == 0 ? 1 : leadingSpaces - 1) + "s", 'A',
						' ');
		String middleRow = String.format("%-" + lineLength + "s%s", a, a);

		return List.of(firstRow, middleRow, firstRow);
	}

}
