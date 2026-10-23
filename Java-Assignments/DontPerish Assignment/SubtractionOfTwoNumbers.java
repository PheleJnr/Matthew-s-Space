//import scanner to collect two integer input from user 
//Declare your main method
//Declare the method name
//initialise the subtraction of two numbers into the subtractNumber variable
//return the subtractNumber
//then display 


import java.util.Scanner;

    public class SubtractionOfTwoNumbers {

        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        System.out.print("Enter an Integer: ");
        int number1 = input.nextInt();

        System.out.print("Enter an Integer: ");
        int number2 = input.nextInt();

        System.out.println(subtractionNumbers(number1, number2));

}

        public static int subtractionNumbers(int number1, int number2){
        
        int subtractNumber = number2 - number1;
        return subtractNumber;

}

}



