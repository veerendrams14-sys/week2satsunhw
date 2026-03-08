import java.util.ArrayList;

public class NumberList {
    public static void main(String[] args) {

        // Create ArrayList using Generics
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add 5 numbers
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Print numbers
        for (Integer num : numbers) {
            System.out.println(num);
        }
    }
}
