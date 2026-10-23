/*Declare the main method, Initialize the count and sum, and the condition of less than equal to Fifty, the increment factor and then print out*/

public class SumOfNumbersOneToFifty {

	public static void main(String[] args) {
	
	int sum = 0;

	int count = 1;

	while (count <= 50){
	count++;
	
	sum += count;
	
	
	}

	System.out.printf("The Sum of Number is: %d ", sum);

}

}