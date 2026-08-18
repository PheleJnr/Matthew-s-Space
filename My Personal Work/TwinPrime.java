import java.util.Scanner;

	public class TwinPrime {

		public static void main(String[] args)  {

		System.out.print("The Twin Prime numbers between 1 to 1000:\n");
	
		for (int number = 2; number <= 998; number++){

			boolean firstNumber = true;
			
			for (int count = 2; count <= number / 2; count++){	
			
				if (number % count == 0){
				
					firstNumber = false;
					
					break;
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

}

}
