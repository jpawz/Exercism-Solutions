import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

	List<Signal> calculateHandshake(int number) {
		List<Signal> signals = new ArrayList<>();

		int[] code = new int[5];

		for (int i = 0; i < 5; i++) {
			code[i] = number % 2;

			number = number / 2;
		}

		for (int i = 0; i < 4; i++) {
			if (code[i] == 1) {
				signals.add(numberToSignal(i));
			}
		}

		if (code[4] == 1) {
			Collections.reverse(signals);
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
