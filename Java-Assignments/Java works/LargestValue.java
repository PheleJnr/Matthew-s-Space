/*I just modified the first number input and have it stored in the smallest number variable instead of the largest number unlike number 1 question. Then have i mmade another modification on my if condition where before if the number entered again is greater than largestNumber stored in the largestNumber it should be the new largestNumber now changed to smallest number where if the number is lesser than the smallestNumber in the variable stored previously it should become the new smallest number and it should print the overall smallest number out when the loop/iteration is complete*/

import java.util.Scanner;
 
	public class SmallestValue {

	   public static void main(String[] args) {
	   Scanner input = new Scanner(System.in);
	
	   System.out.print("Enter Weight of Water in Kilograms: ");
	   double weightOfWater = input.nextDouble();
	   
	   System.out.print("Enter The Initial Temperature: " + "celcius");
	   double initialTemperature = input.nextDouble();

	   System.out.print("Enter The Final Temperature: " + "celcius");
	   double finalTemperature = input.nextDouble();
	   
	   double energy = weightOfWater * (finalTemperature - initialTemperature) * 	   4184;
	   
	   System.out.println("\nThe Energy Needed is " + energy);

}


}