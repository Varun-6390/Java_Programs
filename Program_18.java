// Java enhanced switch case




import java.util.Scanner;

public class Program_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day: ");
        String day = scanner.nextLine();

        scanner.close();

        switch (day.toLowerCase()) {
            case "monday", "tuesday", "wednesday", "thursday", "friday" ->
                System.out.println("Not a weekend");

            case "saturday", "sunday" ->
                System.out.println("Weekend");

            default -> System.out.println("Not a day");
        }
    }
}
