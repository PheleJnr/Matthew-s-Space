import java.util.Scanner;

public class Main {
public static void main(String[] args) {

  	   Scanner input = new Scanner(System.in);

	System.out.print("Enter an Integer: ");
	int integer = input.nextInt();

	System.out.println(Kata.isEven(integer));


	System.out.print("Enter a Number: ");
	int number = input.nextInt();

	System.out.println(Kata.isPrimeNumber(number));

	System.out.print("Enter First Number: ");
	int firstNumber = input.nextInt();

	System.out.print("Enter Second Number: ");
	int secondNumber = input.nextInt();

	System.out.println(Kata.subtract(firstNumber, secondNumber));


	System.out.print("Enter First Number: ");
	int numberFirst = input.nextInt();

	System.out.print("Enter Second Number: ");
	int numberSecond = input.nextInt();

	System.out.println(Kata.divide(numberFirst, numberSecond));


  	 System.out.print("Enter an Intger: ");
  	 int myNumber = input.nextInt();

  	 System.out.println(Kata.factorOf(myNumber));


	System.out.print("Enter an Integer: ");
	int value = input.nextInt();

	System.out.println(Kata.isSquare(value));


  	 System.out.print("Enter a 5 digit Integer: ");
  	 int digit = input.nextInt();

  	 System.out.println(Kata.isPalindrome(digit));

  	  System.out.print("Enter a Number: ");
  	  int num = input.nextInt();

  	  System.out.println(Kata.factorialOf(num));

  	   System.out.print("Enter a Number: ");
  	   int score = input.nextInt();

  	   System.out.println(Kata.squareOf(score));

	}

}