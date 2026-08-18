import java.util.Arrays;


public class DescendingOrderArray {

    public static void main(String[] args) {

    int[] array = {1, 2, 3, 4, 5};
    
    System.out.println(Arrays.toString(descendingOrderarray(array)));
    

}


    public static int[] descendingOrderarray(int[] array) {

        for(int count = 0; count < array.length-1; count++){
    
            for(int check = 0; check < (array.length-1) - count; check++){

                if(array[check] < array[check + 1]){

                    int temp = array[check];

                    array[check] = array[check + 1];

                    array[check + 1] = temp;
    
                 }

                
            

            }


    
        }
        


    return array;
    }

}



