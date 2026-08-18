import java.util.Scanner;

    public class Kata {

        public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = userInput.nextInt();

        System.out.println(isPrime(number));


}


        public static boolean isPrime(int number){

        
		for(int count = 2; count < number; count++) {
			if(number % count == 0) {
				return false;
			}
		}
		return true;
                
        if(number <= 1) {
		return false;
		}


        }





}
