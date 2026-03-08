import java.util.ArrayList;

public class MaxNumberList {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding numbers
        numbers.add(10);
        numbers.add(25);
        numbers.add(5);
        numbers.add(40);
        numbers.add(15);

        int max = numbers.get(0);

        // Finding largest number
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Maximum Number: " + max);
    }
}