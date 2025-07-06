// Multithreading = Enables a program to run multiple threads concurrently
//                               (Thread = A set of instructions that run independently)
//                               Useful for background tasks or time-consuming operations

public class Program_70_a {
     public static void main(String[] args) {


        Thread thread1 = new Thread(new Program_70_b("PING"));
        Thread thread2 = new Thread(new Program_70_b("PONG"));

        System.out.println("GAME START!");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        }
        catch (InterruptedException e) {
            System.out.println("Main thread was interrupted");
        }

        System.out.println("GAME OVER!");
    }
}
