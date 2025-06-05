public class Program_42 {
    public static void main(String[] args) {

        Car[] cars = { new Car("Mustang", "Red"),
                new Car("Corvette", "Blue"),
                new Car("Charger", "Yellow") };

        for (Car car : cars) {
            car.color = "black";
        }

        for (Car car : cars) {
            car.drive();
        }
    }
}

class Car {

    String model;
    String color;

    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    void drive() {
        System.out.println("You drive the " + this.color + " " + this.model);
    }
}
