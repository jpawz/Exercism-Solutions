import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

	List<Signal> calculateHandshake(int number) {
		List<Signal> signals = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			if ((number % 2 == 1) && i != 4) {
				signals.add(numberToSignal(i));
			}

			if (i == 4 && number % 2 == 1) {
				Collections.reverse(signals);
			}

			number = number / 2;
		}

		return signals;
	}

	private static Signal numberToSignal(int number) {
		return switch (number) {
		case 0 -> Signal.WINK;
		case 1 -> Signal.DOUBLE_BLINK;
		case 2 -> Signal.CLOSE_YOUR_EYES;
		case 3 -> Signal.JUMP;
		default -> throw new IllegalArgumentException("Unexpected value: " + number);
		};
	}

}
