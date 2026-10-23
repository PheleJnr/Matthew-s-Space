public class Kata {

	public static boolean isEven(int integer) {
		if(integer % 2 == 0) {
		return true;
		}
	return false;
	}

	public static boolean isPrimeNumber(int number) {
		if(number <= 1) {
		return false;
		}

		for(int count = 2; count < number; count++) {
			if(number % count == 0) {
				return false;
			}
		}
		return true;
	}


	public static int subtract(int firstNumber, int secondNumber) {
		int subtract = firstNumber - secondNumber;

		if (subtract < 0) {
			return -subtract;
		}
	return subtract;
	}


	public static float divide(int numberFirst, int numberSecond) {

		if(numberSecond == 0) {
			return 0;
		}

	float divide = numberFirst / numberSecond;
		return divide;
	}


	public static int factorOf(int myNumber) {
		int sum = 0;
		int counter = 1;

		for(int count = 1; count <= myNumber; count++) {
			if(myNumber % count == 0) {
				sum += counter;
			}
		}
		return sum;
	}


	public static boolean isSquare(int value) {

		for(int count = 1; count <= value; count++) {
			if(count * count == value) {
				return true;
			}
		}
		return false;
	}



	public static boolean isPalindrome(int digit) {
		if(digit >= 10000 && digit <= 99999) {

		int last = digit % 10;
		int fourth = digit / 10 % 10;
		int middle = digit / 100 % 10;
		int second = digit / 1000 % 10;
		int first = digit / 10000 % 10;

		if(first == last && second == fourth) {
			return true;
		}
		return false;
		
		}
		System.out.println("Go back and Enter a Five Digit Integer joor!");
		return false;
	}


	public static long factorialOf(int num) {
		int counter = 1;
		for(int count = num; count >= 1; count--) {
			counter *= count;
		}
		return counter;
	}

	public static long squareOf(int score) {
		long squareOf = score * score;
		return squareOf;
	}

}
