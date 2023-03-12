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
		throw new UnsupportedOperationException("Please implement the BirdCount.hasDayWithoutBirds() method");
	}

	public int getCountForFirstDays(int numberOfDays) {
		throw new UnsupportedOperationException("Please implement the BirdCount.getCountForFirstDays() method");
	}

	public int getBusyDays() {
		throw new UnsupportedOperationException("Please implement the BirdCount.getBusyDays() method");
	}

	private int getTodayIndex() {
		return birdsPerDay.length - 1;
	}
}
