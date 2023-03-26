import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

public class Hamming {
	private final String leftStrand;
	private final String rightStrand;

	public Hamming(String leftStrand, String rightStrand) {
		this.leftStrand = leftStrand;
		this.rightStrand = rightStrand;
	}

	public int getHammingDistance() {
		int differences = 0;

		CharacterIterator leftStrandIterator = new StringCharacterIterator(leftStrand);
		CharacterIterator rightStrandIterator = new StringCharacterIterator(rightStrand);

		while ((leftStrandIterator.current() != CharacterIterator.DONE)
				&& (rightStrandIterator.current() != CharacterIterator.DONE)) {
			if (leftStrandIterator.current() != rightStrandIterator.current()) {
				differences++;
			}
		}

		return differences;
	}
}
