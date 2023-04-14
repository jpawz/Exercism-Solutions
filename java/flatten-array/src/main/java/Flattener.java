import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Flattener {

    List<?> flatten(List<?> list) {
	if (list == null || list.isEmpty()) {
	    return Collections.emptyList();
	}
	return list.stream()
		   .filter(Objects::nonNull)
		   .flatMap(o -> o instanceof List<?> ? flatten((List<?>) o).stream() : Stream.of(o))
		   .collect(Collectors.toList());
    }
}