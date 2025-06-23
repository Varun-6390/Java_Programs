//Library ClassAdd commentMore actions

public class Program_53_b {
    String name;
    int year;
    Program_53_c[] books;

    Program_53_b(String name, int year, Program_53_c[] books) {
        this.name = name;
        this.year = year;
        this.books = books;
    }

    void display() {
        System.out.println("The " + this.name + " " + this.year);
        for (Program_53_c book : books) {
            System.out.println(book.displayInfo());
        }
    }
}
