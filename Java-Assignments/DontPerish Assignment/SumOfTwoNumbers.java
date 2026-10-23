//import scanner to collect input from user 
//Declare your main method
//Declare the method name
//initialise the sum of two numbers into the sumResult variable
//return the sumResult
//then display 


import java.util.Scanner;

    public class SumOfTwoNumbers {

        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        System.out.print("Enter an Integer: ");
        int number1 = input.nextInt();

        System.out.print("Enter an Integer: ");
        int number2 = input.nextInt();

        System.out.println(sumNumber(number1, number2));

}

        public static int sumNumber(int number1, int number2) {
        
        int sumResult = number1 + number2;
        return sumResult;

}

}














































