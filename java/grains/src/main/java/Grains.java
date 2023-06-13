import java.math.BigInteger;
import java.util.stream.Stream;

class Grains {

	BigInteger grainsOnSquare(final int square) {
		if (square < 1 || square > 64) {
			throw new IllegalArgumentException("square must be between 1 and 64");
		}

		return Stream.iterate(BigInteger.ONE, grains -> grains.add(grains))
				.limit(square)
				.reduce((prev, curr) -> curr)
				.orElse(BigInteger.ZERO);
	}

	BigInteger grainsOnBoard() {
		return Stream.iterate(BigInteger.ONE, grains -> grains.add(grains))
				.limit(64)
				.reduce((prev, curr) -> prev.add(curr))
				.orElse(BigInteger.ZERO);
	}

}
