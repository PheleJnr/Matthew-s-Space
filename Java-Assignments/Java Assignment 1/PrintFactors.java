//Import scanner
//Declare the main method
//Collect input from user 
//Use the for loop to iterate for the factors of the number inputted by the user 
//Then Display the factors of number inputted by the user 



import java.util.Scanner;

public class PrintFactors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int number = input.nextInt();

        System.out.print("Factors of " + number + ": ");

       
        for (int factor = 1; factor <= number; factor++) {
            if (number % factor == 0) {
                System.out.print(factor + " ");
            }
        }

        System.out.println(); 
    }
}