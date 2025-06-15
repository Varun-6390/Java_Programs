
// Interface = A blueprint for a class that specifies a set of abstract methods
//                     that implementing classes MUST define.
//                     Supports multiple inheritance-like behavior.

public class Program_49_a {
    public static void main(String[] args) {
        Program_49_d rabbit = new Program_49_d();
        Program_49_e hawk = new Program_49_e();
        Program_49_f fish = new Program_49_f();

        rabbit.flee();
        hawk.hunt();

        fish.flee();
        fish.hunt();
    }
}