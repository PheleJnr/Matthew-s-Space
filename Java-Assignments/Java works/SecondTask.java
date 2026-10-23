import java.util.Scanner;
public class SecondTask {
	public static void main (String[]args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int number = input.nextInt();
	
	int square = number * number; 
	System.out.println("square: " + square);
	
	if(number > 100 && square > 100) {
	    System.out.println("The number and square is greater than 100");
}
	if(number == 100 && square == 100) {
	    System.out.println("The number and square is equal than 100");
}

	if(number != 100 && square != || number < 100 && square < 100) {
	    System.out.println("The number and square is not equal to and less than 100"); 
}


}

}