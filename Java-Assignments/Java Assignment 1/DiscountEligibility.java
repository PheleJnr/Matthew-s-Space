import java.util.Scanner;

public class DiscountEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter total bill amount: ");
        double totalBill = input.nextDouble();

        System.out.print("Are you a member (yes/no): ");
        String membership = input.next();

        double discount = 0.0;
        double finalAmount = totalBill;
        String message = "";

        if (totalBill >= 1000 && membership.equals("yes")) {
            discount = totalBill * 0.10;
            finalAmount = totalBill - discount;
            message = "10% member discount applied!";

        } else if (totalBill >= 1000) {
            discount = totalBill * 0.05;
            finalAmount = totalBill - discount;
            message = "5% non-member discount applied!";

        } else {
            message = "No discount applied.";
        }

        System.out.println("Original bill: $" + totalBill);
        System.out.println("Discount: $" + discount);
        System.out.println("Final amount: $" + finalAmount);
        System.out.println(message);
    }
}