import java.util.HashSet;

public class ProductIds {
    public static void main(String[] args) {

        HashSet<Integer> productIDs = new HashSet<>();

        // Adding product IDs
        productIDs.add(101);
        productIDs.add(102);
        productIDs.add(103);
        productIDs.add(101);
        productIDs.add(104);

        // Printing unique IDs
        for (int id : productIDs) {
            System.out.print(id + " ");
        }
    }
}
