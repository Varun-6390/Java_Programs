        // .toString() = Method inherited from the Object class.
        // Used to return a string representation of an object.
        // By default, it returns a hash code as a unique identifier.
        // It can be overridden to provide meaningful details.

public class Program_47_a {
    public static void main(String[] args) {


        Program_47_b car1 = new Program_47_b("Ford", "Mustang", 2025, "Red");
        Program_47_b car2 = new Program_47_b("Chevrolet", "Corvette", 2026, "Blue");

        System.out.println(car1);
        System.out.println(car2);
    }
}
