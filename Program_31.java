        // array = a collection of values of the same data type
        // * think of it as a variable that can store more than 1 value *

public class Program_31 {
    public static void main(String[] args) {


        String[] fruits = { "apple", "orange", "banana", "coconut" };

        // fruits[0] = "pineapple";
        // int numOfFruits = fruits.length;
        // Arrays.sort(fruits);
        // Arrays.fill(fruits, "pineapple");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
