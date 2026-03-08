import java.util.HashSet;

public class CitySet {
    public static void main(String[] args) {

        HashSet<String> cities = new HashSet<>();

        // Adding cities
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Bangalore");
        cities.add("Chennai");

        // Check if Delhi exists
        if (cities.contains("Delhi")) {
            System.out.println("Delhi exists in the Set");
        } else {
            System.out.println("Delhi not found");
        }
    }
}