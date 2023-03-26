import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

public class Hamming {
	private final String leftStrand;
	private final String rightStrand;

	public Hamming(String leftStrand, String rightStrand) {
		validateStrands(leftStrand, rightStrand);
		this.leftStrand = leftStrand;
		this.rightStrand = rightStrand;
	}

	public int getHammingDistance() {
		int differences = 0;

		CharacterIterator leftStrandIterator = new StringCharacterIterator(leftStrand);
		CharacterIterator rightStrandIterator = new StringCharacterIterator(rightStrand);

		while ((leftStrandIterator.current() != CharacterIterator.DONE)
				|| (rightStrandIterator.current() != CharacterIterator.DONE)) {
			if (leftStrandIterator.current() != rightStrandIterator.current()) {
				differences++;
			}
			leftStrandIterator.next();
			rightStrandIterator.next();
		}

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
