import java.util.Arrays;

class Matrix {

	private final int[][] matrix;

	Matrix(String matrixAsString) {
		matrix = parseMatrixString(matrixAsString);
	}

	int[] getRow(int rowNumber) {
		return matrix[rowNumber - 1];
	}

	int[] getColumn(int columnNumber) {
		return Arrays.stream(matrix)
				.mapToInt(row -> row[columnNumber - 1])
				.toArray();
	}

	private int[][] parseMatrixString(String matrixString) {
		String columnSeparator = "\n";
		String rowSeparator = " ";

		return Arrays.stream(matrixString.split(columnSeparator))
				.map(row -> Arrays.stream(row.split(rowSeparator))
						.mapToInt(Integer::parseInt)
						.toArray())
				.toArray(int[][]::new);
	}
}
