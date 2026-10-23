//import scanner to collect input
//Declare the main method 
//prompt the user to input name and age 
//



import java.util.Scanner;

	public class NameAndAge {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter Name of User: ");
	String userName = input.nextLine();

	System.out.print ("Enter Age of User: ");
	int userAge = input.nextInt();

	if (userAge < 18){
		System.out.printf("%s is a child ", userName);
	}
	
	if (userAge >= 18){
		System.out.printf("%s is an adult ", userName);
	}
	
	
}

}	