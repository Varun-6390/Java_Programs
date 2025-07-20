        // abstract = Used to define abstract classes and methods.
        // Abstraction is the process of hiding implementation details
        // and showing only the essential features.
        // Abstract classes CAN'T be instantiated directly.
        // Can contain 'abstract' methods (which must be implemented)
        // Can contain 'concrete' methods (which are inherited)

public class Program_48_a {
    public static void main(String[] args) {


        Program_48_c circle = new Program_48_c(3);
        Program_48_d triangle = new Program_48_d(4, 5);
        Program_48_e rectangle = new Program_48_e(6, 7);

        circle.display();
        triangle.display();
        rectangle.display();

        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());
    }
}
