import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        // Adding numbers
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);

        // Convert List to Set to remove duplicates
        Set<Integer> uniqueNumbers = new LinkedHashSet<>(numbers);

        // Convert Set back to List (optional)
        List<Integer> result = new ArrayList<>(uniqueNumbers);

        System.out.println(result);
    }
}