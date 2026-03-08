import java.util.TreeSet;

public class SortedNumbers {
    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        // Adding numbers
        numbers.add(50);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);

        // Print sorted numbers
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
