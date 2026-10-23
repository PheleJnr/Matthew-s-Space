/*The first thing is to collect input for starting velocity, ending velocity and the time span then calculate the average acceleration using the formular and then print out the average acceleration*/

import java.util.Scanner;
 
	public class GratuityRate {

	   public static void main(String[] args) {
	   Scanner input = new Scanner(System.in);
	
	   System.out.print("Enter Starting Velocity(v0): ");
	   double startingVelocity = input.nextDouble();
	   
	   System.out.print("Enter Ending Velocity(v1): ");
	   double endingVelocity = input.nextDouble();

	   System.out.print("Enter Time Span: ");
	   double timeSpan = input.nextDouble();

	   
	   double averageAcceleration = (endingVelocity - startingVelocity) /  	   	           timeSpan;
	   
	   System.out.println("\nThe Average Acceleration is " +   	   averageAcceleration);

}


}