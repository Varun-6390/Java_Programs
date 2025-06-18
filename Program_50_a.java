// Polymorphism = "POLY-" = "MANY"Add commentMore actions
//               "-MORPH" = "SHAPE"
//                Objects can identify as other objects.
//                Objects can be treated as objects of a common superclass.

public class Program_50_a {
    public static void main(String[] args) {

        Program_50_c bike = new Program_50_c();
        Program_50_d car = new Program_50_d();
        Program_50_e boat = new Program_50_e();

        bike.go();
        car.go();
        boat.go();

        System.out.println();

        Program_50_b[] vechiles = { bike, car, boat };

        for (Program_50_b vechile : vechiles) {
            vechile.go();
        }
    }
}
