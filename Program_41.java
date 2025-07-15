        // overloaded constructors = Allow a class to have multiple constructors
        // with different parameter lists.
        // Enable objects to be initialized in various ways.
public class Program_41 {
    public static void main(String[] args) {


        User user1 = new User("Severus");
        User user2 = new User("Hagrid", "buckbeak@aol.com");
        User user3 = new User("Albus", "Albus@gmail.com", 27);
        User user4 = new User();

        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);

        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);
    }
}

class User {

    String username;
    String email;
    int age;

    User() {
        this.username = "Guest";
        this.email = "Not provided";
        this.age = 0;
    }

    User(String username) {
        this.username = username;
        this.email = "Not provided";
        this.age = 0;
    }

    User(String username, String email) {
        this.username = username;
        this.email = email;
        this.age = 0;
    }

    User(String username, String email, int age) {
        this.username = username;
        this.email = email;
        this.age = age;
    }
}
