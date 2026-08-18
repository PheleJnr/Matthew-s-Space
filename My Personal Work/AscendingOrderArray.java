import java.util.Arrays;


public class AscendingOrderArray {

    public static void main(String[] args) {

    int[] array = {11, 32, 3, 44, 15, 16, 5, 8, 9};
    
    System.out.println(Arrays.toString(ascendingOrderArray(array)));
    

}

    public static int[] ascendingOrderArray(int[] array){

        for (int count = 0; count < array.length - 1; count++){

            for (int check = 0; check < (array.length - 1) - count; check++){

                if(array[check] > array[check + 1]) {

                    int temp = array[check];

                    array[check] = array[check + 1];

                    array[check + 1] = temp;

                }

            }

        }
    return array;
    }


}

    
                
            













