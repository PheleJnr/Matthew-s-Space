/*The first thing is to collect input for x1, x2, y1, y2 and then calculate the distance using the formula and then display the distance*/

import java.util.Scanner;
 
	public class GeometryDistance {

	   public static void main(String[] args) {
	   Scanner input = new Scanner(System.in);
	
	   System.out.print("Enter x1: ");
	   double x1 = input.nextDouble();

	   System.out.print("Enter x2: ");
	   double x2 = input.nextDouble();

	   System.out.print("Enter x3: ");
	   double x3 = input.nextDouble();

	   System.out.print("Enter y1: ");
	   double y1 = input.nextDouble();

	   System.out.print("Enter y2: ");
	   double y2 = input.nextDouble();

	   System.out.print("Enter y3: ");
	   double y3 = input.nextDouble();

	   
	   double side1 = (x1 + y1);
	   double side2 = (x2 + y2);
	   double side3 = (x3 + y3);

	   double s = (side1 + side2 + side3) / 2;

	   double area = Math.pow (s(s - side1)(s - side2)(s - side3), 0.5);


	   //System.out.printf("\nThe Area of a Triangle is: %.2f ", s);
	
	   

}


}