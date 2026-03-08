import java.util.*;

public class ReverseList {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        // Adding numbers
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        // Print in reverse order
        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.print(numbers.get(i) + " ");
        }
    }
}
