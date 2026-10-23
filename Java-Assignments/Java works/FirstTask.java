import java.util.Scanner;
public class FirstTask {
	public static void main (String[]args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int number = input.nextInt();
	
	int square = number * number; 
	
	⁭if(number > 100){
	System.out.println("The number is greater than 100: ");
	}
	
	else if (number == 100){
	System.out.println("The number is equal to 100: ");
	}
	else {
	System.out.println("The number is less than 100: ");
	}

		
	if (square > 100){
	System.out.println("The square of the number is greater than 100");
}
	else if (square == 100) {
	System.out.println("The square of the number is equal to 100");
}
	else {
	System.out.println("The square of the number is less than 100");
}
	
	if (number != 100) {
	System.out.println("The number is not equal to 100");
        }

	
	 if (square != 100) {
	System.out.println("The square of the number is not equal to 100");
        }

}
}



