//import scanner to collect two integer input from user 
//Declare your main method
//Declare the method name
//initialise the number1 into smallest variable
//then use the if statement to check if number2 is lesser than number1, then it should be the new smallest
//then display 


import java.util.Scanner;

    public class SmallerOfTwoNumbers {

        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        System.out.print("Enter an Integer: ");
        int number1 = input.nextInt();

        System.out.print("Enter an Integer: ");
        int number2 = input.nextInt();

        System.out.println(smallNumber(number1, number2));

}

        public static int smallNumber(int number1, int number2){
        
            int smaller = number1;

            if (number2 < number1) {
            smaller = number2;

            }
            
            return smaller;
}

}

























