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
		String[] rows = matrixString.split("\n");
		int[][] m = new int[rows.length][rows[0].split(" ").length];

		for (int i = 0; i < rows.length; i++) {
			String[] cells = rows[i].split(" ");
			for (int j = 0; j < cells.length; j++) {
				m[i][j] = Integer.parseInt(cells[j]);
			}
		}
		return m;
	}
}
