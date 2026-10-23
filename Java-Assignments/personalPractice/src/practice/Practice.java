package practice;

public class Practice {

    public static int findLargestNumber(int[] numbers){
        int largest = 0;

        for(int count = 0; count < numbers.length; count++){
            if (numbers[count] > largest){
                largest = numbers[count];
            }
        }
        return largest;
    }

    public static int getLowestCommonMultiple(int[] numbers) {
        int largestDivisor = findLargestNumber(numbers);
        int lcm = largestDivisor;

        while (true) {
            boolean isLargestDivisor = true;

            for (int count = 0; count < numbers.length; count++) {
                if (largestDivisor % numbers[count] != 0) {
                    isLargestDivisor = false;
                    break;
                }


                }

            if(isLargestDivisor){
                return largestDivisor;

            }
            largestDivisor += lcm;
        }

    }
}
