/*Declare the main method, Initialize the count, and the condition of less than equal to Fifty, the increment factor and then print out*/

public class EvenNumbersTwoToFifty {

	public static void main(String[] args) {

	int count = 2;

	while (count <= 50){
	count++;
	

	if (count % 2 == 0){
	System.out.printf("%d ", count);
	}
	
	}

	System.out.println();

}

}