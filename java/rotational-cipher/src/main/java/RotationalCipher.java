class RotationalCipher {
	private final int shiftKey;

	RotationalCipher(int shiftKey) {
		this.shiftKey = shiftKey;
	}

	String rotate(String data) {
		return data.codePoints()
				.map(this::shiftCodePoint)
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
				.toString();
	}

	private int shiftCodePoint(int codePoint) {
		if (!Character.isLetter(codePoint)) {
			return codePoint;
		}
		char first = Character.isUpperCase(codePoint) ? 'A' : 'a';
		return first + (codePoint + shiftKey - first) % 26;
	}

}
