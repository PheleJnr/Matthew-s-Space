/*declare the main method, initialise the count and product and use the while loop to count, find the factorial and then print it out*/

public class FiveFactorial {

	public static void main(String [] args) {

	int number = 5;
	int product = 1;

	while (number > 1) {

	product = number * product;
	System.out.printf("%d ", product);
	number--;
	}
	
}


}