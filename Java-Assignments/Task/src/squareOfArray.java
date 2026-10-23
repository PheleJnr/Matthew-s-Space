import java.util.Arrays;

public class squareOfArray {

    public static int[] solution(int [] numbers){
        int[] result = new int [numbers.length];

        for (int index = 0; index < numbers.length; index++) {

        if (numbers[index] < -100 || numbers[index] > 1000);

            result[index] = numbers[index] * numbers[index];
        };



        for (int countOne = 0; countOne < result.length-1; countOne++){
            for (int countTwo = 0; countTwo < result.length-1-countOne; countTwo++){

                if (result[countTwo] > result[countTwo + 1]){

                    int temp = result[countTwo];
                    result[countTwo] = result[countTwo + 1];
                    result[countTwo + 1] = temp;
                }
            }
        }return result;



    }

    public static void main(String[] args){


        int [] numbers = {2, -5, 2, 6, 3, 5, 7, 8};
        System.out.print(Arrays.toString(solution(numbers)));



    }


}
