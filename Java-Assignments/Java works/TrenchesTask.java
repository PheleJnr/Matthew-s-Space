import java.util.Scanner;

public class TrenchesTask {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if (number == 0) {
            System.out.println("The number is equal to zero");
        }

        else if (number % 7 == 0) {
            System.out.println("The number is divisible by 7");
        }

        else {
            System.out.println("The number is not divisible by 7");
        }

        if (number % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
    }

	


	
}
}

