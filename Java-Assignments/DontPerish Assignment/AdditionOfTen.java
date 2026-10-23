//import scanner to collect input from user 
//Declare your main method
//Declare the method name
//Initalise for the addition of ten into sumNumbers
//return sumNumbers
//then display


import java.util.Scanner; 

    public class AdditionOfTen {

        public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int number = input.nextInt();

        System.out.println(addTen(number));


}

        public static int addTen(int n){
    
        int sumNumbers = n + 10;
    
        return sumNumbers;

}

}

