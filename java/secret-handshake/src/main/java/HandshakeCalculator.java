import java.util.Collections;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class HandshakeCalculator {

	List<Signal> calculateHandshake(int number) {
		IntPredicate isBitOn = bitIndex -> ((1 << bitIndex) & number) > 0;
		List<Signal> signals = IntStream.range(0, Signal.values().length)
				.filter(isBitOn)
				.mapToObj(i -> Signal.values()[i])
				.collect(Collectors.toList());

		if (isBitOn.test(Signal.values().length)) {
			Collections.reverse(signals);
		}

		return signals;
	}
}
