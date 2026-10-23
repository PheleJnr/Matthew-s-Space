import java.util.Scanner;

	public class DisplayAverageSpeed {

	   public static void main(String[] args) {
	   Scanner input = new Scanner(System.in);

	   System.out.print("Enter Distance Travelled: ");
	   double distance = input.nextDouble();
	
	   System.out.print("Enter Hours: ");
	   int hours = input.nextInt();
	
	   System.out.print("Enter Minutes: ");
	   int minutes = input.nextInt();

	   double totalHours = hours + (minutes / 60);

	   double averageSpeed = distance / totalHours;

	   System.out.printf("Average Speed: %f km", averageSpeed);

	 	   
}




}

/*Collect the distance travelled from user, collect hours and minutes and then convert the minutes into hours to give get the total hours then we calculate the average speed using distance divide by totalhours we have*/