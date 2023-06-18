class MicroBlog {
	public String truncate(String input) {
		int endIndex = input.length() > 5 ? 5 : input.length();
		return input.substring(0, endIndex);
	}
}
