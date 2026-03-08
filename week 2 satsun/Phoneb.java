import java.util.HashMap;

public class Phoneb{
    public static void main(String[] args) {

        // Create HashMap
        HashMap<String, String> contacts = new HashMap<>();

        // Add 5 contacts
        contacts.put("Rahul", "9876543210");
        contacts.put("Amit", "9123456780");
        contacts.put("Priya", "9988776655");
        contacts.put("Sneha", "9090909090");
        contacts.put("Kiran", "9012345678");

        // Search for Rahul
        if (contacts.containsKey("Rahul")) {
            System.out.println("Rahul's Phone Number: " + contacts.get("Rahul"));
        } else {
            System.out.println("Rahul not found in contacts.");
        }
    }
}