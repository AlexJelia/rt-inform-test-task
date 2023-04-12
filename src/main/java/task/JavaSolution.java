package task;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JavaSolution {
    public static <T> Map<T, Integer> foo(List<T> list) {
        Map<T, Integer> map = new HashMap<>();
        for (T item : list) {
            int count = map.getOrDefault(item, 0) + 1;
            map.put(item, count);
        }
        return map;
    }

    public static <T> int countOfElements(List<T> list) {
        // return list.size();
        int count = 0;
        for (T el : list)
            if (el != null) count++;
        return count;
    }
}
