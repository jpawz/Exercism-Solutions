class MicroBlog {
	public String truncate(String input) {
		if (input.length() <= 5)
			return input;

		return input.substring(0, input.offsetByCodePoints(0, 5));
	}
}
