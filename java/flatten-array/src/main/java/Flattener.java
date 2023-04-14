import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

class Flattener {

    List<Object> flatten(List<?> list) {
	List<Object> flatList = new ArrayList<>();
	Deque<Object> stack = new ArrayDeque<>();
	stack.push(list);
	while (!stack.isEmpty()) {
	    Object currentObject = stack.pop();
	    if (currentObject instanceof List<?>) {
		for (Object o : (List<?>) currentObject) {
		    if (o != null)
			stack.push(o);
		}
	    } else {
		flatList.add(currentObject);
	    }
	}
	Collections.reverse(flatList);
	return flatList;
    }
}