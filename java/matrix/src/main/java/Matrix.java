class Matrix {

	private final int[][] matrix;

	Matrix(String matrixAsString) {
		matrix = parseMatrixString(matrixAsString);
	}

	int[] getRow(int rowNumber) {
		return matrix[rowNumber - 1];
	}

	int[] getColumn(int columnNumber) {
		int[] column = new int[matrix.length];

		for (int i = 0; i < matrix.length; i++) {
			column[i] = matrix[i][columnNumber - 1];
		}
		return column;
	}

	private int[][] parseMatrixString(String matrixString) {
		String columnSeparator = "\n";
		String rowSeparator = " ";
		String[] rows = matrixString.split(columnSeparator);
		int numberOfRows = rows.length;
		int numberOfColumns = rows[0].split(rowSeparator).length;
		int[][] matrixOfInts = new int[numberOfRows][numberOfColumns];

		for (int i = 0; i < rows.length; i++) {
			String[] cells = rows[i].split(rowSeparator);
			for (int j = 0; j < cells.length; j++) {
				matrixOfInts[i][j] = Integer.parseInt(cells[j]);
			}
		}
		return matrixOfInts;
	}
}
