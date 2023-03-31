import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

	private static final int handshakeLength = 4;

	private static final Signal[] signals = { Signal.WINK, Signal.DOUBLE_BLINK, Signal.CLOSE_YOUR_EYES, Signal.JUMP };

	List<Signal> calculateHandshake(int number) {
		List<Signal> handshake = new ArrayList<>();

		for (int i = 0; i < handshakeLength; i++) {
			if (isBitSet(number)) {
				handshake.add(signals[i]);
			}

			number = number / 2;
		}

		if (isBitSet(number)) {
			Collections.reverse(handshake);
		}

		return handshake;
	}

	private boolean isBitSet(int number) {
		return number % 2 == 1;
	}
}
