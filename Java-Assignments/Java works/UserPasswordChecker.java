/*Import scanner to collect input, initialise the number, collect input for the password, use the while loop for the user to input again then use the if and else to correct and incorrect the password and then break*/




import java.util.Scanner;

	public class UserPasswordChecker {

		public static void main (String[] args){

		Scanner input = new Scanner(System.in);

		int number = 1;

		System.out.print("Enter User Password: ");
		int userPassword = input.nextInt();

		while (number >= 1) {

		System.out.print("Enter User Password again: ");
		int userTypedPassword = input.nextInt();

		if(userTypedPassword != userPassword) {

		System.out.println("Incorrect password");
		
		}

		else{
			System.out.println("Correct Password");
			break;
		}
		
		
		}
		userPassword++;
}

}
	

		