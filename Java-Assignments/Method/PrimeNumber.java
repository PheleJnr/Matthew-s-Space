import java.util.Scanner;

    public class PrimeNumber {

        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");

        int wholeNumber = input.nextInt();

        int sumResult = dividenumber(wholeNumber);

        System.out.println("Sum of prime number: " + sumResult);


}

    public static int dividenumber(int number){
     int sum = 0;
    
    for(int dividevalue = 2; dividevalue <= number; dividevalue ++){

    while(number % dividevalue == 0){

        sum += dividevalue;
        number = number / dividevalue;
   }
    }
        return sum;
        }


        }
