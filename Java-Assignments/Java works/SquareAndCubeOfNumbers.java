import java.util.Scanner;

	public class AreaAndPerimeter {

	   public static void main(String[] args) {
	   Scanner input = new Scanner(System.in);

	   System.out.print("Enter Side A: ");
	   double a = input.nextDouble();
	
	   System.out.print("Enter Side B: ");
	   double b = input.nextDouble();
	
	   System.out.print("Enter Side C: ");
	   double c = input.nextDouble();

	   System.out.print("Enter Base (one of the sides):  ");
	   double base = input.nextDouble();	   
	
	   System.out.print("Enter Height: ");
	   double height = input.nextDouble();
	
	   

	   double perimeter = a + b + c;
	
	   double area = (base * height) / 2;

	   System.out.printf("The Perimeter is %f%n", perimeter);
	   System.out.printf("The Area is %f%n", area);

}




}

/*  collect the three sides from users, then collect the base also which could be any of the sides recieved, collect the height too from the user. then look for the perimeter and the area*/