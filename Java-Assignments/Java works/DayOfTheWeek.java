import java.util.Scanner;

	public class DayOfTheWeek {
	
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter Number Of Days: ");
	int number = input.nextInt();
	

	int sunday = 1;
	int monday = 2;
	int tuesday = 3;
	int wednesday = 4;
	int thursday = 5;
	int friday = 6;
	int saturday = 0;


	if (number % 7 == 1){
		System.out.print("The day is Monday");
	}

	if (number % 7 == 2){
		System.out.print("TThe day is Tuesday");
	}
	
	if (number % 7 == 3){
		System.out.print("The day is Wednesday");
	}

	if (number % 7 == 4){
		System.out.print("The day is Thursday");
	}
	
	if (number % 7 == 5){
		System.out.print("The day is Friday");
	
	}

	if (number % 7 == 6){
		System.out.print("the day is Saturday");
	}

	if (number % 7 == 0){
		System.out.print("The day is Sunday");
	}
	
	
	
		

}

}