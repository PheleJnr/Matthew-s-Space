import java.util.Scanner;

public class TicketPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        String price;

        if (age < 5) {
            price = "Free";

        } else if (age <= 12) {
            price = "$5";

        } else if (age <= 64) {
            price = "$12";

        } else {
            price = "$8";
        }

        System.out.println("Ticket price: " + price);
    }
}