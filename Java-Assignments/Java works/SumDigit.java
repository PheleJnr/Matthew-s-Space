/*The first thing is to collect input, then initialise numbers where i use remainder division then calculate the sum and then print out the sum of the digit*/

import java.util.Scanner;
 
	public class SumDigit {

	   public static void main(String[] args) {
	   Scanner input = new Scanner(System.in);
	
	   System.out.print("Enter Number between 0 - 1000: ");
	   int number = input.nextInt();

	   int lastNumber = number % 10;
	   int thirdNumber = number / 10 % 10;
	   int secondNumber = number /100 % 10;
	   int firstNumber = number / 1000 % 10;
	   
	   
	   int sum = lastNumber + thirdNumber + secondNumber + firstNumber;

	   System.out.println("The Sum of Digit is: " + sum);

}


}