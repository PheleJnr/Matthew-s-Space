//Import scanner
//Declare the main method
//Collect input from user the number of time to countdown from
//Use the for loop to iterate downward the number of times inputted by the user
//Then Display the count and Blast off


import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to countdown from: ");
        int userInput = input.nextInt();

        for (int count = userInput; count >= 1; count--) {
            System.out.println(count);
        }

        System.out.println("Blast off!");
    }
}