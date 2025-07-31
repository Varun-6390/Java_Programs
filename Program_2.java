// Variables in java

public class Program_2 {
    public static void main(String[] args) {

        int year = 2025;

        double price = 19.99;

        char currency = '$';

        boolean forSale = false;

        String car = "Mustang";
        String color = "red";

        System.out.println("Your choice is a " + color + " " + year + " " + car);
        System.out.println("The price is: " + currency + price);

        if (forSale) {
            System.out.println("There is a " + car + " for sale");
        } else {
            System.out.println("The " + car + " is not for sale");
        }
    }
}
