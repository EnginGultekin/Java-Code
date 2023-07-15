import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 3, 1, 2, 4, 4, 5};
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // HashMap, key-value
        for (int element : array) {
            if (frequencyMap.containsKey(element)) {
                frequencyMap.put(element, frequencyMap.get(element) + 1);
            } else {
                frequencyMap.put(element, 1);
            }
        }

        System.out.println("Element frequencies:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("The number " + entry.getKey() + ": " + entry.getValue());
        }
    }
}