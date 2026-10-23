import java.util.Arrays;

public class MergingArrays {
    
    public static void main(String[] args) {
        
    int [] array = {14, 6, 5, 3, 1};

    int [] arrayTwo = {8, 5, 7};


        System.out.println(Arrays.toString(mergeArrays(array, arrayTwo))); 



    }


    public static int[] mergeArrays(int[] array, int[] arrayTwo) {

    int[] merged = new int[array.length + arrayTwo.length];
    int size = array.length;        

    for (int index = 0; index < array.length; index++){
         merged[index] = array[index];
    }

    for (int count = 0; count < arrayTwo.length; count++){
        merged[size++] = arrayTwo[count];

            
    }


    

    return merged;
    }

   

}
            
