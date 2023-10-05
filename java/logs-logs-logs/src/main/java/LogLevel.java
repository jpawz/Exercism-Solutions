public enum LogLevel {

	UNKNOWN(0),
	TRACE(1),
	DEBUG(2),
	INFO(4),
	WARNING(5),
	ERROR(6),
	FATAL(42);

	private final int levelNumber;

	private LogLevel(int levelNumber) {
		this.levelNumber = levelNumber;
	}

	public int getLevelNumber() {
		return this.levelNumber;
	}
}
