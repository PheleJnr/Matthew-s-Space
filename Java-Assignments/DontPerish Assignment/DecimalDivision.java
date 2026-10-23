//import scanner to collect two integer input from user 
//Declare your main method
//Declare the method name
//initialise the division of two numbers into the divideNumber variable
//return the divideNumber
//then display 


import java.util.Scanner;

    public class DecimalDivision {

        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        System.out.print("Enter an Integer: ");
        double number1 = input.nextDouble();

        System.out.print("Enter an Integer: ");
        double number2 = input.nextDouble();

        System.out.println(divisionNumbers(number1, number2));

}

        public static double divisionNumbers(double number1, double number2){
        
        double divideNumber = number1 / number2;
        return divideNumber;

}

}























