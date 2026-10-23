/*The first thing is to collect input for weight of water, initial temperature and final temperature and then look for the energy needed using the formular then print out the energy needed*/

import java.util.Scanner;
 
	public class AverageAcceleration {

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