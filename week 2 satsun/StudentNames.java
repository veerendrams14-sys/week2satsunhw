import java.util.ArrayList;

public class StudentNames {
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> students = new ArrayList<>();

        // Add 5 student names
        students.add("Rahul");
        students.add("Anita");
        students.add("Kiran");
        students.add("Meena");
        students.add("Arjun");

        // Print student names
        for(String name : students) {
            System.out.println(name);
        }
    }
}