import java.util.Arrays;

public class SumOfArrayNumbersForward {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4};

        System.out.println(Arrays.toString(sumFromTheFirstForward(array)));
    }

    public static int[] sumFromTheFirstForward(int[] array) {
    

        int[] result = new int[array.length];
        
        int sum = 0;

        for (int count = 0; count < array.length; count++) {
        
            sum = sum + array[count];
            
            result[count] = sum;
        }

        return result;
    }
}




