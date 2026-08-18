import java.util.Scanner;

    public class Perfect {
    	public static boolean perfectNumber(int number) {

    		int sum = 0;

    		for (int count = 1; count <= number / 2; count++) {

    			if (number % count == 0) {
   				sum = sum + count;

			}

		}

	        	if (sum == number) {
	    		return true;
		}

	        	return false;
	}

	    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");

        int number = input.nextInt();

        System.out.println(perfectNumber(number));


}


}










