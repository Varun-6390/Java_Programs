// Threading = Allows a program to run multiple tasks simultaneously
//                       Helps improve performance with time-consuming operations
//                      (File I/O, network communications, or any background tasks)

// How to create a Thread
// Option 1. Extend the Thread class (simpler)
// Option 2. Implement the Runnable interface (better)

import java.util.Scanner;

public class Program_69_a {
     public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        Program_69_b myRunnable = new Program_69_b();
        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true); // This thread will end when Main thread finishes
        thread.start();

        System.out.println("You have 10 seconds to enter your name");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        scanner.close();
    }
}
