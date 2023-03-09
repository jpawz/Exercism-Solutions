class SqueakyClean {
	static String clean(String identifier) {

		return identifier.replace(" ", "_").replaceAll("\\W", "CTRL");
	}
}
