/*The first thing is to import the scanner in order to obtain input from the user. Then after the user input the number, I store it in the largest number variable, I then initialize the value to 1. So while value is less than 10, value increment by 1, then I asked the user to enter number plus the value and then store the next number into a number variable so if the number is greater than largest number, then the number should become the largest number. Then print the largest number*/



import java.util.Scanner;
 
	Public class LargestValue {

	   public static void main(string[] args) {
	   Scanner input = new Scanner(System.in);
	
	   System.out.print("Enter number 1: ");
	   int largestNumber = input.next();

	   int value = 1;

	   while (value < 10){
	   value++;
	   System.out.print("Enter number" + value + ": ");
	   int number = input.nextInt();

	   if(number > largestNumber){
	     largestNumber = number;
	     }

	   }		
	   
	   System.out.println("\nThe Largest Number is " + largestNumber);

}


}