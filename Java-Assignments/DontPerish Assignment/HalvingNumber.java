//import scanner to collect input from user 
//Declare your main method
//Declare the method name
//Initalise for the halving of number into number
//return number
//then display


import java.util.Scanner;

    public class HalvingNumber {

        
        public static double halveNumber(double n) {

        double number = n / 2;
        return number;

}

        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = input.nextDouble();


        System.out.println(halveNumber(number));

}




}














