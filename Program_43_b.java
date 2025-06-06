public class Program_43_b {
    public static void main(String[] args) {

        Program_43_a friend1 = new Program_43_a("Harry");
        Program_43_a friend2 = new Program_43_a("Ron");
        Program_43_a friend3 = new Program_43_a("Hermoine");
        Program_43_a friend4 = new Program_43_a("Jinny");

        System.out.println(friend1.name);
        System.out.println(friend2.name);
        System.out.println(friend3.name);
        System.out.println(friend4.name);

        Program_43_a.showFriends();
    }
}
