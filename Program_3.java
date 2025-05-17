// User input in java

import java.util.Scanner;

public class Program_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("\nEnter your age: ");
        int age = scanner.nextInt();

        System.out.print("\nWhat is your gpa: ");
        double gpa = scanner.nextDouble();

        System.out.print("\nAre you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your gpa is: " + gpa);

        if (isStudent) {
            System.out.println("You are enrolled in classes");
        } else {
            System.out.println("You are NOT enrolled in classes");
        }

        scanner.close();
    }
}