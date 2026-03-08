import java.util.LinkedHashMap;

public class Productlist {
    public static void main(String[] args) {

        // Create LinkedHashMap
        LinkedHashMap<String, Integer> products = new LinkedHashMap<>();

        // Add 5 products
        products.put("Laptop", 60000);
        products.put("Mobile", 20000);
        products.put("Headphones", 3000);
        products.put("Keyboard", 1500);
        products.put("Mouse", 800);

        // Print products in insertion order
        for (String product : products.keySet()) {
            System.out.println(product + " : " + products.get(product));
        }
    }
} 
