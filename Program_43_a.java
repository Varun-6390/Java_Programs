// static = Modifies a variable or method belong to the class,
// rather than to any specific object.
// Commonly used for utility methods or shared resources.

public class Program_43_a {

    static int numOfFriends;
    String name;

    Program_43_a(String name) {
        this.name = name;
        numOfFriends++;
    }

    static void showFriends() {
        System.out.println("You have " + numOfFriends + " total friends");
    }
}
