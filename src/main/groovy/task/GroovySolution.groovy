package task

class GroovySolution {

    static foo(list) {
        def map = [] as HashMap
        for (element in list) {
            def count = map.getOrDefault(element, 0) + 1
            map.put(element, count)
        }
        return map
    }

    static countOfElements(list) {
        //  return list.size();
        def count = 0;
        for (element in list)
            if (element != null) count++;
        return count;
    }
}
