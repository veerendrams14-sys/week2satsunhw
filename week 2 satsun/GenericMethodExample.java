public class GenericMethodExample {

    // Generic method
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {

        // Integer array
        Integer[] numbers = {10, 20, 30, 40, 50};

        // String array
        String[] names = {"Rahul", "Aman", "Kiran"};

        // Call generic method
        System.out.println("Integer Array:");
        printArray(numbers);

        System.out.println("String Array:");
        printArray(names);
    }
}
