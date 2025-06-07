
// Inheritance = One class inherits the attributes and methods
//                         from another class.

public class Program_44_a {
    public static void main(String[] args) {
        Program_44_e dog = new Program_44_e();
        Program_44_f cat = new Program_44_f();
        Program_44_c plant = new Program_44_c();

        dog.eat();
        System.out.println(cat.lives);
        cat.eat();
        plant.photosynthesis();
    }
}