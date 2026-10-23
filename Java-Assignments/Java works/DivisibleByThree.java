/*The first thing is to declare my method. Then initialise sum to be 0 and then number to be 1. Then use the While iteration sequence to loop muliple times when number is less than equal to 30 on the condition if the number remainder three is equal to zero. Then the number should be stored in the Sum variable and added together. Then print the sum of all the numbers that meets the condition*/


public class DivisibleByThree {

	   public static void main(String[] args) {
	   
	
	   int sum = 0;
	   
	   int number = 1;

	   while (number <= 30){
	   number++;

	   if (number % 3 == 0) {
	   	sum += number;
	   }


	   }

	   System.out.println("\nThe sum of NUmbers divisible by Three is: " + sum);
}


}