import java.util.Arrays;

class BirdWatcher {
	private final int[] birdsPerDay;

	public BirdWatcher(int[] birdsPerDay) {
		this.birdsPerDay = birdsPerDay.clone();
	}

	public int[] getLastWeek() {
		return Arrays.copyOfRange(birdsPerDay, 0, 7);
	}

	public int getToday() {
		int todayIndex = getTodayIndex();
		return birdsPerDay[todayIndex];
	}

	public void incrementTodaysCount() {
		int todayIndex = getTodayIndex();
		birdsPerDay[todayIndex] = birdsPerDay[todayIndex] + 1;
	}

	public boolean hasDayWithoutBirds() {
		for (int birds : birdsPerDay) {
			if (birds == 0)
				return true;
		}
		return false;
	}

	public int getCountForFirstDays(int numberOfDays) {
		return Arrays.stream(birdsPerDay)
				.limit(numberOfDays)
				.reduce(Integer::sum)
				.orElse(0);
	}

	public int getBusyDays() {
		return (int) Arrays.stream(birdsPerDay)
				.filter(count -> count >= 5)
				.count();
	}

	private int getTodayIndex() {
		return birdsPerDay.length - 1;
	}
}
