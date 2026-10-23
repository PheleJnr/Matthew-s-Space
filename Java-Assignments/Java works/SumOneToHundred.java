/* Declare the main method, Initialize the number, and the condition of less than equal to Hundred, the increment factor, then the sum of the numbers from 1 to 100 and then print out*/

public class SumOneToHundred {

	public static void main(String[] args) {

	int sum = 0;

	int number = 1;

	for(number = 1; number <= 100; number++){
		sum += number;
		
		}

		System.out.printf("The sum of Numbers is %d ", sum);
}

}