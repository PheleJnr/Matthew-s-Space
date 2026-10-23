import java.util.Scanner;

    public class PrimeNumber {
        public static void main(String[] args) {




}

    public static int getTwinPrime(int, number, number2) {
  
      
        for (int number = 2; number <= 998; number++){

			boolean firstNumber = true;
			
			for (int count = 2; count <= number / 2; count++){	
			
				if (number % count == 0){
				
					firstNumber = false;
					
					break;
				} 		
			}

        }

        int number2 = number + 2;

			boolean secondNumber = true;
			
			for (int count = 2; count <= number2 / 2; count++){
			
				if (number2 % count == 0){
				
					secondNumber = false;
					
					break;
				}
			}
			
			if (firstNumber && secondNumber){
				System.out.println("(" + number + " " + number2 + ")");
			}

		}

















