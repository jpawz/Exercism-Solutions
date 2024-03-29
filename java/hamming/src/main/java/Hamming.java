import java.util.stream.IntStream;

public class Hamming {
	private final String leftStrand;
	private final String rightStrand;

	public Hamming(String leftStrand, String rightStrand) {
		validateStrands(leftStrand, rightStrand);
		this.leftStrand = leftStrand;
		this.rightStrand = rightStrand;
	}

	public int getHammingDistance() {
		int differences = (int) IntStream.range(0, leftStrand.length())
				.filter(i -> leftStrand.charAt(i) != rightStrand.charAt(i))
				.count();
		return differences;
	}

	private void validateStrands(String leftStrand, String rightStrand) {
		if (leftStrand.isEmpty() && !rightStrand.isEmpty()) {
			throw new IllegalArgumentException("left strand must not be empty.");
		}
		if (rightStrand.isEmpty() && !leftStrand.isEmpty()) {
			throw new IllegalArgumentException("right strand must not be empty.");
		}
		if (leftStrand.length() != rightStrand.length()) {
			throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
		}
	}

}
