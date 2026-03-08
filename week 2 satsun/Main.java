// Generic class
class Box<T> {
    T value;

    // Method to set value
    void setValue(T value) {
        this.value = value;
    }

    // Method to print value
    void printValue() {
        System.out.println(value);
    }
}

public class Main {
    public static void main(String[] args) {

        // Box for Integer
        Box<Integer> intBox = new Box<>();
        intBox.setValue(100);
        intBox.printValue();

        // Box for String
        Box<String> strBox = new Box<>();
        strBox.setValue("Hello Java");
        strBox.printValue();
    }
}
