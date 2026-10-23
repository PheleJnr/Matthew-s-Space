//import scanner to collect input from user 
//Declare your main method
//Declare the method name
//Use the if statement
//return -n or n
//then display


import java.util.Scanner;

    public class DivisibleByThree {

        public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int number = input.nextInt();


        System.out.println(divisibleThree(number));
    
}

        public static boolean divisibleThree(int number){
        
        if (number % 3 == 0)
            return true;
        
        
        return false;

        } 




}


























