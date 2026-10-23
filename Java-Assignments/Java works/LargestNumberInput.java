/*import scanner to collect input from user, then have it stored in the userInput, then initialise the number, while the number is less than equal to ten, increment the number by 1, then ask the user to input the next number storing it in the largestInput variable. Then the if condition where if largestInput is greater than userInput variable then the userInput now becomes the largest input. print out the UserInput*/ 

import java.util.Scanner;

	public class LargestNumberInput {

		public static void main (String[] args){

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Number: ");
		int userInput = input.nextInt();

		int number = 1;		

		while (number <= 10) {
		number++;
		System.out.print("Enter Next Number ");
		int largestInput = input.nextInt();
	
		if(largestInput > userInput){
		userInput = largestInput;
		}
		

		}
		System.out.printf("LargestInput is: %d ", userInput);
}

}
	