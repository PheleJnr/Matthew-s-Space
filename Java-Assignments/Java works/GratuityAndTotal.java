/*The first thing is to collect input for the sub total, the gratuity rate and then calculate the gratuity and total. then display the gratuity and the total we have after calculations*/

import java.util.Scanner;
 
	public class GratuityAndTotal {

	   public static void main(String[] args) {
	   Scanner input = new Scanner(System.in);
	
	   System.out.print("Enter The Sub Total: ");
	   double subTotal = input.nextDouble();
	   
	   System.out.print("Enter The Gratuity Rate: ");
	   double gratuityRate = input.nextDouble();

	   double gratuity = (subTotal * gratuityRate) / 100;

	   double total = subTotal + gratuity;
	   
	   System.out.println("\nGratuity = " + gratuity);
	
	   System.out.println("\nTotal = " + total);

}


}