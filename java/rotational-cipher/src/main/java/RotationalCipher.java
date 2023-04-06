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
		if (codePoint >= 'a' && codePoint <= 'z') {
			return (codePoint + shiftKey) <= 'z' ? codePoint + shiftKey : codePoint + shiftKey - 'z' + 'a' - 1;
		}
		if (codePoint >= 'A' && codePoint <= 'Z') {
			return (codePoint + shiftKey) <= 'Z' ? codePoint + shiftKey : codePoint + shiftKey - 'Z' + 'A' - 1;
		}
		return codePoint;
	}

}
