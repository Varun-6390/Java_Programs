// Anonymous class = A class that doesn't have a name. Cannot be reused.
//                                     Add custom behavior without having to create a new class.
//                                     Often used for one time uses (TimerTask, Runnable, callbacks)

public class Program_63_a {
    public static void main(String[] args) {

        Program_63_b dog1 = new Program_63_b();
        Program_63_b dog2 = new Program_63_b() {
            @Override
            void speak() {
                System.out.println("Scooby Doo says *Ruh Roh*");
            }
        };

        dog1.speak();
        dog2.speak();
    }
}
