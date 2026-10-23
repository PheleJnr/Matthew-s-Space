import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer (a): ");
        int a = input.nextInt();

        System.out.print("Enter second integer (b): ");
        int b = input.nextInt();

        System.out.print("Enter third integer (c): ");
        int c = input.nextInt();

        int largest = a;

        if (b > largest) {
            largest = b;
        }

        if (c > largest) {
            largest = c;
        }

        System.out.println("The largest number is: " + largest);
    }
}