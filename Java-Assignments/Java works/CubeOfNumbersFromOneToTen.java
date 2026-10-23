/* Declare the main method, Initialize the number, and the condition of less than equal to twenty, the increment factor, then number *  number * number into the cube Variable and then print out*/

public class CubeOfNumbersFromOneToTen {

	public static void main(String[] args) {

	
	int cube = 0;
	
	for(int number = 0; number <= 10; number++) {
	cube = number * number * number;
		System.out.printf("%d ", cube);
	}
	
		System.out.println();

}		

}