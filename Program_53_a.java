// Aggregation = Represents a "has-a" relationship between objects.Add commentMore actions
//               One object contains another object as part of its structure,
//               but the contained object/s can exist independently.

public class Program_53_a {
    public static void main(String[] args) {
        Program_53_c book1 = new Program_53_c("Harry Potter and the Philosopher's Stone", 223);
        Program_53_c book2 = new Program_53_c("Harry Potter and the Chamber of Secrets", 251);
        Program_53_c book3 = new Program_53_c("Harry Potter and the Prisoner of Azkaban", 317);

        Program_53_c[] book = { book1, book2, book3 };
        Program_53_b library = new Program_53_b("Sharma Library", 2004, book);
        library.display();
    }
}
