class MicroBlog {
	public String truncate(String input) {
		if (input.length() <= 5)
			return input;

		int lastIndex = input.length();
		int codePointCount = 0;
		do {
			codePointCount = input.codePointCount(0, lastIndex--);
		} while (codePointCount > 5);
		return input.substring(0, lastIndex + 1);
	}
}
