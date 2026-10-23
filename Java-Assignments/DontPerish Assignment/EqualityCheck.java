//import scanner to collect two integer input from user 
//Declare your main method
//Declare the method name
//initialise the number1 into largest variable
//then use the if statement to check if number2 is greater number1, then it should be the new largest
//then display 



import java.util.Scanner;

    public class EqualityCheck { 

        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        System.out.print("Enter an Integer: ");
        int number1 = input.nextInt();

        System.out.print("Enter an Integer: ");
        int number2 = input.nextInt();

        System.out.println(equalityChecker(number1, number2));

}


        public static boolean equalityChecker (int number1, int number2){

        if (number1 == number2){
            return true;
        }else {

            return false; 

            }      
}


}



}

























