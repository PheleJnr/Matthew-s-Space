import java.util.Scanner;

public class SafeDivision {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number (x): ");
        int x = input.nextInt();

        System.out.print("Enter the number (y): ");
        int y = input.nextInt();

        if (y != 0) {
            double result = (double) x / y;

            System.out.println(x + " / " + y + " = " + result);

        } else {
            System.out.println("Cannot divide by zero");
        }
    }
}