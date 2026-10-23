/*Declare the main method, initialise the number, and the condition of less than hundred, the incrementing factor if condition is met and the counting plus equal to then print it out*/

public class NumberExistOneToHundred {

	public static void main(String[] args){

	int number = 2;
	int count = 0;

	while (number < 100){	
	count += 1;
	number++;	

	}

	System.out.print(count);
}


}