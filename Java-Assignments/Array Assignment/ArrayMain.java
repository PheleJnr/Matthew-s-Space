public class ArrayMain {
	public static void main(String[] args) {

		 int[] numbers = {50, 69, 43, 59, 78};
		 System.out.println("The Largest Element in the Array is " + ArrayKata.maximumIn(numbers));

		 int[] scores = {67, 35, 15, 72, 89};
		 System.out.println("The Smallest Element in the Array is " + ArrayKata.minimumIn(scores));

		 int[] values = {66, 12, 73, 75, 84};
		 System.out.println("The Sum Of The Elements in the Arrays is " + ArrayKata.sumOf(values));

		 int[] amount = {24, 37, 53, 44, 97};
		 System.out.println("The Sum Of the Even Numbers in the Array is " + ArrayKata.sumOfEvenNumbersIn(amount));

		 int[] number = {60, 81, 55, 23, 93};
		 System.out.println("The Sum Of the Odd Numbers in the Array is " + ArrayKata.sumOfOddNumbersIn(number));

		 int[] score = {210, 65, 88, 79, 37};

		 int[] result = ArrayKata.maximumAndMinimumOf(score);
		 System.out.println("The Minimum Element in the Array is " + (result[0]));
		 System.out.println("The Maximum Element in the Array is " + (result[1]));

		 int[] oddNumbers = {43, 62, 93, 86, 28};
		 System.out.println("The Number of Odd Numbers in the Array is " + ArrayKata.noOfOddNumbersIn(oddNumbers));

		 int[] evenNumbers = {56, 10, 47, 24, 93};
		 System.out.println("The Number of Even Numbers in the Array is " + ArrayKata.noOfEvenNumbersIn(evenNumbers));

		 int[] num = {34, 64, 74, 82, 77};
		 int[] answer = ArrayKata.evenNumbersIn(num);

	 	 System.out.println("These are the Array Of Even Numbers " + (answer[0]));
	 	 System.out.println("These are the Array Of Even Numbers " + (answer[1]));
	 	 System.out.println("These are the Array Of Even Numbers " + (answer[2]));
	 	 System.out.println("These are the Array Of Even Numbers " + (answer[3]));

		 int[] item = {75, 65, 34, 33, 24};
		 int[] total = ArrayKata.oddNumbersIn(item);

		 System.out.println("These are the Array Of Odd Numbers " + (total[0]));
		 System.out.println("These are the Array Of Odd Numbers " + (total[1]));
		 System.out.println("These are the Array Of Odd Numbers " + (total[2]));



		int[] items = {50, 15, 7, 20, 16};
		int[] totals = ArrayKata.squareNumbersIn(items);

		System.out.println("Square Number " + (totals[0]));
		System.out.println("Square Number " + (totals[1]));
		System.out.println("Square Number " + (totals[2]));
		System.out.println("Square Number " + (totals[3]));
        System.out.println("Square Number " + (totals[4]));





	}	
}
