import java.util.Scanner;

	public class Fahrenheit {

	   public static void main(String[] args) {
	   Scanner input = new Scanner(System.in);

	   System.out.print("Enter Temperature in Celsius: ");
	   double celsius = input.nextDouble();
	
	   double fahrenheit = (celsius * 9 / 5) + 32;

	   System.out.printf("The Fahrenheit is %fF", fahrenheit);
	   

	 	   
}




}

/*Collect the Temperature in Celsius and then convert to Fahrenheit using formular ((c * 9/5) + 32) and then print out the fahrenheit*/