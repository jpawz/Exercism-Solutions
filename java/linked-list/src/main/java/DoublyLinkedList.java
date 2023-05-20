class DoublyLinkedList<T> {
	private Element<T> head;
	private Element<T> tail;

	void push(T value) {
		if (head == null) {
			head = tail = new Element<>(value, null, null);
		} else {
			Element<T> newElement = new Element<>(value, tail, null);
			tail.next = newElement;
			tail = newElement;
		}
	}

	T pop() {
		T value = tail.value;
		tail = tail.prev;
		return value;
	}

	void unshift(T value) {
		throw new UnsupportedOperationException("Please implement the DoublyLinkedList.unshift() method.");
	}

	T shift() {
		T value = head.value;
		head = head.next;
		return value;
	}

	private static final class Element<T> {
		private final T value;
		private Element<T> prev;
		private Element<T> next;

		Element(T value, Element<T> prev, Element<T> next) {
			this.value = value;
			this.prev = prev;
			this.next = next;
		}
	}
}
