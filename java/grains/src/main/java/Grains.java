import java.math.BigInteger;

class Grains {

	BigInteger grainsOnSquare(final int square) {
		if (square < 1 || square > 64) {
			throw new IllegalArgumentException("square must be between 1 and 64");
		}
		BigInteger result = new BigInteger("1");
		for (int i = 1; i < square; i++) {
			result = result.add(result);
		}
		return result;
	}

	BigInteger grainsOnBoard() {
		throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
	}

}
