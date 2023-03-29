import java.util.stream.IntStream;

class DifferenceOfSquaresCalculator {

	int computeSquareOfSumTo(int input) {
		return (int) Math.pow(IntStream.rangeClosed(1, input)
				.sum(), 2);
	}

	int computeSumOfSquaresTo(int input) {
		throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
	}

	int computeDifferenceOfSquares(int input) {
		throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
	}

}
