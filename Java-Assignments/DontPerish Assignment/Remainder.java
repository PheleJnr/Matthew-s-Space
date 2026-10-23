//import scanner to collect two integer input from user 
//Declare your main method
//Declare the method name
//initialise the remainder of two numbers into the remainNumber variable
//return the remainNumber
//then display 


import java.util.Scanner;

    public class Remainder {

        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        System.out.print("Enter an Integer: ");
        int number1 = input.nextInt();

        System.out.print("Enter an Integer: ");
        int number2 = input.nextInt();

        System.out.println(remainderNumber(number1, number2));

}

        public static int remainderNumber(int number1, int number2){
        
        int remainNumber = number1 % number2;
        return remainNumber;

}

}





















