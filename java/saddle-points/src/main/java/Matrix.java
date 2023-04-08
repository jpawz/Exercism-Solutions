import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Matrix {

  private final int rows;
  private final int cols;
  private final int[] rowsMax;
  private final int[] colsMin;

  Matrix(List<List<Integer>> values) {
    rows = values.size();
    cols = rows > 0 ? values.get(0).size() : 0;

    rowsMax = values.stream()
        .mapToInt(row -> row.stream().mapToInt(Integer::intValue).max().orElseThrow()).toArray();
    colsMin = IntStream.range(0, cols)
        .map(col -> IntStream.range(0, rows).map(i -> values.get(i).get(col)).min().orElseThrow())
        .toArray();
  }

  Set<MatrixCoordinate> getSaddlePoints() {
    return IntStream.range(0, rows).boxed()
        .flatMap(row -> IntStream.range(0, cols).filter(col -> rowsMax[row] == colsMin[col])
            .mapToObj(col -> new MatrixCoordinate(row + 1, col + 1)))
        .collect(Collectors.toSet());
  }
}
