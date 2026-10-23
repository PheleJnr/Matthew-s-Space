//Import the scanner
//Declare the main method
//collect input for the number of times 
//Intialise power
//Use the for loop to iterate the number of times the user input by multiplying by power by 2 each time 
//Then print out


import java.util.Scanner;

public class PowersOfTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of powers to display: ");
        int number = input.nextInt();

        System.out.println("First " + number + " powers of 2:");

        long power = 1; 

        for (int count = 1; count <= number; count++) {
            power = power * 2; 
            System.out.println("2^" + count + " = " + power);
        }
    }
}