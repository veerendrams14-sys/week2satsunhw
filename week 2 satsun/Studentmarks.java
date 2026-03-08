import java.util.HashMap;

public class Studentmarks {
    public static void main(String[] args) {

        HashMap<String, Integer> students = new HashMap<>();

        students.put("Rahul", 85);
        students.put("Anita", 90);
        students.put("Kiran", 78);
        students.put("Meena", 88);
        students.put("Arjun", 92);

        for (String name : students.keySet()) {
            System.out.println(name + " : " + students.get(name));
        }
    }
}