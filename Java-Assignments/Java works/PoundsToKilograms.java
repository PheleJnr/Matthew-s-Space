/*The first thing is to collect input for number and then initialised for onePounds then after calculate for kilograms using number collected by the value of onePounds to kilogram 0.454, then print the result*/

import java.util.Scanner;
 
	public class PoundsToKilograms {

	   public static void main(String[] args) {
	   Scanner input = new Scanner(System.in);
	
	   System.out.print("Enter x1: ");
	   double x1 = input.nextDouble();

	   System.out.print("Enter x2: ");
	   double x2 = input.nextDouble();

	   System.out.print("Enter y1: ");
	   double y1 = input.nextDouble();

	   System.out.print("Enter y2: ");
	   double y2 = input.nextDouble();
	   
	   double distance = Math.pow((x2 - x1) + (y2 - y1), 0.5);

	   System.out.printf("\nThe Distance %.2f ", distance);
	
	   

}


}