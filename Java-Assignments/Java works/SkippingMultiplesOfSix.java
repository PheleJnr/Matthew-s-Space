/*Declare the main method, initialise the number, and the condition of less than equal to hundred, the incrementing factor then the if condition of numbers skipping multiples of six and then print it out*/

public class SkippingMultiplesOfSix {

	public static void main(String[] args){

	int number = 1;

	while (number <= 100){
	number++;
	
	if (number % 6 != 0)
	System.out.printf("%d ", number);

	}
	
	}


}


}