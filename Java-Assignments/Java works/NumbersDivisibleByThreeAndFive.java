/* Declare the main method, Initialize the number, and the condition of less than equal to one thousand, the increment factor, then the if condition of numbers divisible by 3 and 5 and then print out*/

public class NumbersDivisibleByThreeAndFive {

	public static void main(String[] args) {


	int number = 1;

	for(number = 1; number <= 1000; number++){
	
	if (number % 3 == 0 && number % 5 == 0){

		System.out.printf("The Numbers Divisible by 3 and 5 is %d%n ", number);

	}
	
	}
		
}

		
}