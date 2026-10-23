import java.util.Scanner;

	public class TotalOfFiveNumbers {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	int count = 1;

	int total = 0;

	while(count <= 5) {
	
	System.out.print("Enter the Number: ");
	int number = input.nextInt();
	total += number;
	count++;

	}

	System.out.printf("The Total is: %d ", total);

}

}
	


