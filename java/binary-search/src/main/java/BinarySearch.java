import java.util.List;

class BinarySearch {

	private List<Integer> songList;

	public BinarySearch(List<Integer> songList) {
		this.songList = songList;
	}

	int search(int a, int[] arr) {
		throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
	}

	int search(float a, float[] arr) {
		throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
	}

	int search(double a, double[] arr) {
		throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
	}

	int search(long a, long[] arr) {
		throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
	}

	public int indexOf(int songTitle) throws ValueNotFoundException {
		int low = 0;
		int hight = songList.size() - 1;

		while (low <= hight) {
			int mid = (low + hight) / 2;
			if (songList.get(mid) == songTitle) {
				return mid;
			} else if (songList.get(mid) > songTitle) {
				hight = mid - 1;
			} else
				low = mid + 1;
		}

		throw new ValueNotFoundException("Value not in array");
	}

}
