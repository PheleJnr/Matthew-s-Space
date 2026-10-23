//Import scanner
//Declare the main method
//Collect input from user 
//Use the while loop to iterate 
//Then Display the original number and the reversed number


import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int number = input.nextInt();

        int reversed = 0;
        int original = number; 

        while (number != 0) {
            int digit = number % 10;     
            reversed = reversed * 10 + digit; 
            number = number / 10;        
        }

        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}