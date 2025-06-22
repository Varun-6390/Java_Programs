public class Program_52_a {
    public static void main(String[] args) {

        // They help protect object data and add rules for accessing or modifying them.
        // GETTERS = Methods that make a field READABLE.
        // SETTERS = Methods that make a field WRITEABLE.

        Program_52_b car = new Program_52_b("Charger", "Yellow", 10000);

        car.setColor("Blue");
        car.setPrice(5000);

        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());
    }
}


