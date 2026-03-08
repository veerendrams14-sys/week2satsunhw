import java.util.HashMap;

public class ContactSearch {
    public static void main(String[] args) {

        HashMap<String, String> contacts = new HashMap<>();

        // Adding contacts
        contacts.put("Rahul", "9876543210");
        contacts.put("Anita", "9123456780");
        contacts.put("Vijay", "9988776655");

        // Search phone number using name
        String name = "Anita";

        if (contacts.containsKey(name)) {
            System.out.println("Phone Number of " + name + ": " + contacts.get(name));
        } else {
            System.out.println("Contact not found");
        }
    }
}