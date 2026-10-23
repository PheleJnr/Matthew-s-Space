/*The first thing is to collect input, then use the for loop and if condition to make the asterisk in a right angled triangle*/

import java.util.Scanner;
 
	public class RightAngledTriangle {

	   public static void main(String[] args) {
	   Scanner input = new Scanner(System.in);
	
	   System.out.print("Enter Number: ");
	   int number = input.nextInt();

	   for (int count =1; count <= number; count++){
	   	if (number > 10) {
	   	System.out.print("Make sure your Number is within the range of 1 - 10");
	   	break;
	   }

	   for(int asterisks = 1; asterisks <= count; asterisks++) {
	   	System.out.print(" * ");
	   }

	   	System.out.println();

	   }
	   
	   
}


}