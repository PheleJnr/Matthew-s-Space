/*Declare the main method, Initialize the count product and total, and the condition of less than equal to twelve, the increment factor and then print out*/

public class MultiplicationOfTwelve {

	public static void main(String[] args) {
	
	int product = 12;

	int total = 0;

	int count = 1;

	while (count <= 12){
	
	total = product * count;
	System.out.printf("%d * %d = %d%n ", product, count, total);
	count++;
	
	}


}

}