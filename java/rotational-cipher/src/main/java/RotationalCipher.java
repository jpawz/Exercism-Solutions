class RotationalCipher {
	private final int shiftKey;

	RotationalCipher(int shiftKey) {
		this.shiftKey = shiftKey;
	}

	String rotate(String data) {
		return data.codePoints()
				.map(c -> c + shiftKey)
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
				.toString();
	}

}
