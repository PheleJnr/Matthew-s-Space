//import scanner to collect input from user 
//Declare your main method
//Declare the method name
//Initalise for the cube of n into thrice 
//return thrice
//then display


import java.util.Scanner;

    public class CubeNumber {

        public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        System.out.println(cubeNumber(number));


}

        public static int cubeNumber(int number){

        int thrice = number * number * number;
        return thrice;
}
}

