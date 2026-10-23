/*Starting from my number 2 code, I declared my largestNumber to be zero, the positive count to be zero, the negative count to be zero too then also the value changes from 1 to zero too, so while value is less than ten, the value should have an increment of one, then the looping goes on and stored in the CurrentValue variable. so if the currentValue is greater than the largestNumber, then the currentValue would become the new largestNumber. if the currentValue is greater than zero, there would be a positiveCount++ and if the cuurentValue is lesser than zero there would be negativeCount++. Then printing of the largestNumber, positiveCount and negativeCount*/

import java.util.Scanner;
 
	public class SmallestValue {

	   public static void main(String[] args) {
	   Scanner input = new Scanner(System.in);
	
	   int largestNumber = 0;
	   int positiveCount = 0;
	   int negativeCount = 0;

	   int value = 0;

	   while (value < 10){
	   value++;
	   System.out.print("Enter number" + value + ":");
	   int currentValue = input.nextInt();

	   if (currentValue > largestNumber) {
	   largestNumber = currentValue
	   }
	
	   if (currentValue > 0) {
	   positiveCount++;
	   
	   }else if (currentValue < 0){
	   negativeCount++;
	   }


	   }

	   System.out.println("\nThe Positive Number is " + positiveCount + "\nThe Negative Number is " + negativeCount);
	   System.out.println("\nThe Largest Number is " + largestNumber);

}


}