// Books classAdd commentMore actions

public class Program_53_c {

    String name;
    int pages;

    Program_53_c(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }

    String displayInfo() {
        return this.name + " (" + this.pages + " pages)";
    }
}
