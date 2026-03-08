import java.util.HashMap;

public class FrequencyCount {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 2, 3, 3, 3, 4};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : numbers) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        // Print frequency
        for (int key : map.keySet()) {
            System.out.println(key + " → " + map.get(key));
        }
    }
}