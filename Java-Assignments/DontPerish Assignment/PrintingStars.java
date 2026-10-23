//import scanner to collect two integer input from user 
//Declare your main method
//Declare the method name
//use for loop for iteration
//return number
//then display the asterisks according to number of times user input


import java.util.Scanner;

    public class PrintingStars {

        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a Value: ");
        int number = input.nextInt();

        asterisks(number);

//        System.out.println(asterisks(number));


}

        public static int asterisks (int number){

        for (int count = 1; count <= number; count++){
        System.out.print("*");
        
        }
        System.out.println();

        return number;
}

}



