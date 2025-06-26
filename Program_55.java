public class Program_55 {
     public static void main(String[] args) {

        // Wrapper classes = Allow primitive values (int, char, double, boolean)
        //                                   to be used as objects. "Wrap them in an object"
        //                                   Generally, don't wrap primitives unless you need an object.
        //                                   Allows use of Collections Framework and static utility methods.

        // Autoboxing
        Integer a = 123;
        Double b = 3.14;
        Character c = '$';
        Boolean d = true;
   
        // Unboxing
        int x = a;
        double y = b;
        char z = c;
        boolean p = d;
        System.out.println(x +" "+ y +" "+ z +" "+ p);
    }
}
