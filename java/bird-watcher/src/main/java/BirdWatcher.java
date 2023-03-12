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
		int todayIndex = birdsPerDay.length - 1;
		return birdsPerDay[todayIndex];
	}

	public void incrementTodaysCount() {
		throw new UnsupportedOperationException("Please implement the BirdCount.incrementTodaysCount() method");
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
}
