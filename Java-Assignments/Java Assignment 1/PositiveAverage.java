//import scanner 
//initialise the sum and count 
//collect input from the user
//use the while loop to count for the number of times positive numbers was entered
//display the average of the sum of the positive added numbers


import java.util.Scanner;

public class PositiveAverage {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0;         
        int count = 0;       

        System.out.print("Enter a number (negative to stop): ");
	int number = input.nextInt();

		while (number >= 0) {
   		 sum = sum + number;
    		 count++;
    
   	System.out.print("Enter a number (negative to stop): ");
    	    number = input.nextInt();

        }

	if (count > 0) {
            double average = (double) sum / count;

	System.out.printf("Average of all Positive numbers entered: %.2f%n", average);	
}
    
}
}