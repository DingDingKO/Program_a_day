package Day30_HashMap;

import java.util.HashMap;

public class MapFactory {
    public HashMap<Integer, String> makeMap() {
        HashMap<Integer, String> numbers = new HashMap<Integer, String>(10);
        numbers.put(0, "Zero");
        numbers.put(1, "One");
        numbers.put(2, "Two");
        numbers.put(3, "Three");
        numbers.put(4, "Four");
        numbers.put(5, "Five");
        numbers.put(6, "Six");
        numbers.put(7, "Seven");
        numbers.put(8, "Eight");
        numbers.put(9, "Nine");

        return numbers;
    }
}
