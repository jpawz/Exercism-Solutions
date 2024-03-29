import static java.util.stream.IntStream.range;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Matrix {

    private final int rows;
    private final int cols;
    private final int[] rowsMax;
    private final int[] colsMin;

    Matrix(List<List<Integer>> values) {
	rows = values.size();
	cols = rows > 0 ? values.get(0).size() : 0;

	rowsMax = values.stream()
			.mapToInt(row -> row.stream()
					    .mapToInt(Integer::intValue).max().orElseThrow())
			.toArray();

	colsMin = range(0, cols)
				.map(col -> range(0, rows).map(i -> values.get(i).get(col)).min().orElseThrow())
				.toArray();
    }

    Set<MatrixCoordinate> getSaddlePoints() {
	return range(0, rows).boxed()
			     .flatMap(row -> range(0, cols)
							   .filter(col -> rowsMax[row] == colsMin[col])
							   .mapToObj(col -> new MatrixCoordinate(row + 1, col + 1)))
			     .collect(Collectors.toSet());
    }
}
