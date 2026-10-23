/*Import Scanner and Declare the main method, collect input from user, then the while loop add the break clause once the user enters zero*/


import java.util.Scanner;

	public class UserNumberUntilZero {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter the Number: ");
	int number = input.nextInt();

	while(number != 0) {
	
	System.out.print("Enter the Number: ");
	number = input.nextInt();

	if (number == 0){
	break;
	}
	number++;
	

	}

}

}