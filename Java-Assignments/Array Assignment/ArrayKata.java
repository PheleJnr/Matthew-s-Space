public class ArrayKata {
	 public static int maximumIn(int[] numbers) {
	 int largest = numbers[0];

	 for(int count = 0; count < numbers.length; count++) {
	 	if(numbers[count] > largest) {
	 		largest = numbers[count];
	 	}
	 }
	 return largest;
	 }


	 public static int minimumIn(int[] scores) {
	 	int smallest = scores[0];

	 	for(int count = 0; count < scores.length; count++) {
	 		if(scores[count] < smallest) {
	 			smallest = scores[count];
	 		}
	 	}
	 	return smallest;
	 }


	 public static int sumOf(int[] values) {
	 	int sum = 0;

	 	for(int count = 0; count < values.length; count++) {
	 		sum += values[count];
	 	}
	 	return sum;
	 }


	 public static int sumOfEvenNumbersIn(int[] amount) {
	 	int sum = 0;

	 	for(int count = 0; count < amount.length; count++) {
	 		if(amount[count] % 2 == 0){
	 			sum += amount[count];
	 		}
	 	}
	 	return sum;
	 }

	 public static int sumOfOddNumbersIn(int[] number) {
	 	int sum = 0;

	 	for(int count = 0; count < number.length; count++) {
	 		if(number[count] % 2 != 0) {
	 			sum += number[count];
	 		}
	 	}
	 	return sum;
	 }

	 public static int[] maximumAndMinimumOf(int[] score) {
	 	int minimum = score[0];
	 	int maximum = score[0];

	 	for(int count = 1; count < score.length; count++) {
	 		if(score[count] < minimum) {
	 		minimum = score[count];

	 		}
	 	}

	 	for(int counter = 1; counter < score.length; counter++) {
	 		if(score[counter] > maximum) {
	 		maximum = score[counter];
	 		}
	 	}

	 	int[] result = {minimum, maximum};
	 	return result;
	 }

	 public static int noOfOddNumbersIn(int[] oddNumbers) {
	 	int counter = 0;

	 	for(int count = 0; count < oddNumbers.length; count++) {
	 		if(oddNumbers[count] % 2 != 0) {
	 			counter++;
	 		}
	 	}
	 	return counter;
	 }

	 public static int noOfEvenNumbersIn(int[] evenNumbers) {
	 	int counter = 0;

	 	for(int count = 0; count < evenNumbers.length; count++) {
	 		if(evenNumbers[count] % 2 == 0) {
	 			counter++;
	 		}
	 	}
	 	return counter;
	 }


	 public static int[] evenNumbersIn(int[] num) {
	 	int counter = 0;

	 	for(int count = 0; count < num.length; count++) {
	 		if(num[count] % 2 == 0) {
	 			counter++;
	 		}
		
	 	}
	 	int[] even = new int[counter];

	 	int counters = 0;

	 	for(int count = 0; count < num.length; count++) {
	 		if(num[count] % 2 == 0) {
	 			even[counters] = num[count];
	 			counters++;
	 		}
	 	}
	 	return even;
	 }

	 public static int[] oddNumbersIn(int[] item) {
	 	int counter = 0;

	 	for(int count = 0; count < item.length; count++) {
	 		if(item[count] % 2 != 0) {
	 			counter++;
	 		}
	 	}
	 	int odd[] = new int[counter];
	 	int counters = 0;

	 	for(int count = 0; count < item.length; count++) {
	 		if(item[count] % 2 != 0) {
	 			odd[counters] = item[count];
	 			counters++;
	 		}
	 	}
	 	return odd;
	 }




	public static int[] squareNumbersIn(int[] items) {

        int[] square = new int[items.length]; 
        for (int count = 0; count < items.length; count++) {
            square[count] = items[count] * items[count]; 
    }

    return square;
}







}


































