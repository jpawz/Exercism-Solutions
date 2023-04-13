import java.util.ArrayList;
import java.util.List;

class Flattener {

    @SuppressWarnings("unchecked")
    List<Object> flatten(List<Object> list) {
	List<Object> flatList = new ArrayList<>();
	for (Object o : list) {
	    if (o instanceof List) {
		flatList.addAll((List<Object>) o);
	    } else {
		flatList.add(o);
	    }
	}
	return flatList;
    }
}