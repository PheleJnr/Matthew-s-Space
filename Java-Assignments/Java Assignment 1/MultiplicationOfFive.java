//Declare the main method 
//Initialise product, total and count
//Use the while loop to iterate 12 times 
//Calculate for total
//Print out the result

public class MultiplicationOfFive {

	public static void main(String[] args) {
	
	int product = 5;

	int total = 0;

	int count = 1;

	while (count <= 12){
	
	total = product * count;
	System.out.printf("%d * %d = %d%n ", product, count, total);
	count++;
	
	}


}

}