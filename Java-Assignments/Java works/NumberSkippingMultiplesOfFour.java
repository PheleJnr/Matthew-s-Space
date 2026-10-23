/* Declare the main method, Initialize the number, and the condition of less than equal to one thousand, the increment factor, then the if condition of numbers skipping multiples of four and then print out*/


public class NumberSkippingMultiplesOfFour {

	public static void main(String[] args) {


	int number = 1;

	for(number = 1; number <= 100; number++){
	
	if (number % 4 != 0){

		System.out.printf("The Numbers skipping multiples of 4 is %d%n ", number);

	}
	
	}
		
}

		
}