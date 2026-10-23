/*import scanner to collect input from user, then have it stored in the userInput, then initialise the number, while the number is less than ten, increment the number by 1, then ask the user to input the next number storing it in the smallestInput variable. Then the if condition where if smallestInput is lesser than userInput variable then the userInput now becomes the smallest input. print out the UserInput*/

import java.util.Scanner;

	public class SmallestNumberInput {

		public static void main (String[] args){

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Number: ");
		int userInput = input.nextInt();

		int number = 1;		

		while (number < 10) {
		number++;
		System.out.print("Enter Next Number ");
		int smallestInput = input.nextInt();
	
		if(smallestInput < userInput){
		userInput = smallestInput;
		}
		

		}
		System.out.printf("SmallestInput is: %d ", userInput);
}

}