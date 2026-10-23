import java.util.Arrays;

public class DescendingOrderArray {
    
    public static void main(String[] args) {
        
    int [] array = {14, 6, 5, 3, 2, 1};
     System.out.println(Arrays.toString(descendingOrder(array)));   
        
    }
        public static int[] descendingOrder(int[] array) {
        
        int temp = 0;

        for (int index = 0; index <= array.length-1; index++){

            for (int count = 0; count < array.length-1; count++ ){
            
                if (array[index] > array[count]){

                    temp = array[count];
                    
                    array[count] = array[index];

                    array[index]= temp;
            
                    
                }


            }



        }
        return array;


}

}
        







