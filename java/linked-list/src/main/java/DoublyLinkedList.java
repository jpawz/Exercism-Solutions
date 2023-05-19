class DoublyLinkedList<T> {
	private Element<T> head;

	void push(T value) {
		if (head == null) {
			head = new Element<>(value, null, null);
		} else {
			Element<T> element = new Element<>(value, null, head);
			head = element;
		}
	}

	T pop() {
		T value = head.value;
		head = head.next;
		return value;
	}

	void unshift(T value) {
		throw new UnsupportedOperationException("Please implement the DoublyLinkedList.unshift() method.");
	}

	T shift() {
		throw new UnsupportedOperationException("Please implement the DoublyLinkedList.shift() method.");
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
