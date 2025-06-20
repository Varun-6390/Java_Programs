import java.util.Scanner;

public class Program_51_a {
    public static void main(String[] args) {

        // Runtime polymorphism = When the method that gets executed is decided
        //                                               at runtime based on the actual type of the object.

        Scanner scanner = new Scanner(System.in);

        Program_51_b animal;

        System.out.print("Would you like a dog or a cat? (1 = dog, 2 = cat): ");
        int choice = scanner.nextInt();

        if(choice == 1){
            animal = new Program_51_c();
            animal.speak();
        }
        else if(choice == 2){
            animal = new Program_51_d();
            animal.speak();
        }
        else
        {
            System.out.println("Invalid input");
        }
        scanner.close();
    }
    
}

