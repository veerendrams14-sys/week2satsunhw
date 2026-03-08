import java.util.TreeMap;

public class Student {
    public static void main(String[] args) {

        // Create TreeMap
        TreeMap<String, Integer> students = new TreeMap<>();

        // Add student marks
        students.put("Aman", 85);
        students.put("Kiran", 90);
        students.put("Rahul", 78);

        // Print students and marks
        for (String name : students.keySet()) {
            System.out.println(name + " " + students.get(name));
        }
    }
}
