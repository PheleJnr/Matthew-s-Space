//import scanner to collect input from user 
//Declare your main method
//Declare the method name
//Use the if statement
//return -number or number
//then display


import java.util.Scanner;

    public class AbsoluteValue {

        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.println(absoluteValue(number));

}


        public static int absoluteValue(int number){
    
        if (number < 0){
        return -number;

        } else { 
            return number;
        }
}

}
















