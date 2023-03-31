import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class HandshakeCalculator {

	private static final int handshakeLength = 4;

	private static final Map<Integer, Signal> signalsMap = new HashMap<>(handshakeLength);

	static {
		signalsMap.put(0, Signal.WINK);
		signalsMap.put(1, Signal.DOUBLE_BLINK);
		signalsMap.put(2, Signal.CLOSE_YOUR_EYES);
		signalsMap.put(3, Signal.JUMP);
	}

	List<Signal> calculateHandshake(int number) {
		List<Signal> signals = new ArrayList<>();

		for (int i = 0; i <= handshakeLength; i++) {
			if (number % 2 == 1) {
				if (!isLastDigit(i)) {
					signals.add(signalsMap.get(i));
				} else {
					Collections.reverse(signals);
				}
			}

			number = number / 2;
		}

		return signals;
	}

	private boolean isLastDigit(int i) {
		return i == handshakeLength;
	}

}
