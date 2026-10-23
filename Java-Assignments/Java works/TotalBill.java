import java.util.Scanner;

	public class TotalBill {

	   public static void main(String[] args) {
	   Scanner input = new Scanner(System.in);

	   System.out.print("Enter Number of Electricity units consumed: ");
	   double electricityUnitConsumed = input.nextDouble();
	
	   System.out.print("Enter Cost Per Unit: " );
	   double costPerUnit = input.nextDouble();   

	   double totalBill = electricityUnitConsumed * costPerUnit;

	   System.out.println("The Total Bill is: " + totalBill);	   
}

}

/*The first thing is to prompt the user to get the user to input the Electricity Units Consumed and then get the user to input the cost per units. Then get the Total Bill by multiplying the electricity unit consumed by cost per unit, then have it display*/