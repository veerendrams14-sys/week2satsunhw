import java.util.HashMap;

public class StudentMarks1 {
    public static void main(String[] args) {

        HashMap<String, Integer> students = new HashMap<>();

        // Adding students and marks
        students.put("Rahul", 85);
        students.put("Anita", 90);
        students.put("Vijay", 78);
        students.put("Sneha", 92);
        students.put("Arjun", 88);

        // Printing student names and marks
        for (String name : students.keySet()) {
            System.out.println(name + " : " + students.get(name));
        }
    }
}
