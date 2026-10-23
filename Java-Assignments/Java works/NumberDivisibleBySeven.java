/* Declare the main method, Initialize the number, and the condition of less than equal to one thousand, the increment factor, then the if condition of numbers divisible by 7 and then print out*/


public class NumberDivisibleBySeven {

	public static void main(String[] args) {


	int number = 1;

	for(number = 1; number <= 100; number++){
	
	if (number % 7 == 0){

		System.out.printf("The Numbers Divisible by 7 is %d%n ", number);

	}
	
	}
		
}

		
}