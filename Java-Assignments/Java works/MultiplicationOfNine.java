/* Declare the main method, Initialize number, product and total, and the condition of less than equal to Twelve, the increment factor, then the multiplication of nine times and then print out*/

public class MultiplicationOfNine {

	public static void main(String[] args) {

	int product = 9;
	int total = 0;

	for(int number = 1; number <= 12; number++){
		total = product * number;
		System.out.printf("%d * %d = %d%n", product, number, total);
		
		}
		
		
}

}