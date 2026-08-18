import java.util.Arrays;


public class SortedAscendingOrderArray {

    public static void main(String[] args) {

    int[] array = {5, 9, 3, 6, 2};
    
    System.out.println(Arrays.toString(sortingAscendingOrderArray(array)));
    

}

    public static int[] sortingAscendingOrderArray(int[] array){
    
         int primeCount = 0;
        
        for (int check = 0; check < array.length -1; check++){
            
                if (array[check] % 2 == 0)
                
                    primeCount++;
                
                
            if(array[check] == 2)
            
            
                
        }
            return array;

            
            
         
        int[] newArray = new int [array.length];     
        
        for(int count = 0; count < newArray.length - 1; count++){

            for(int check = 0; check < (newArray.length - 1- count); check++){

                if(newArray[check] > newArray[check + 1]) {

                    int temp = newArray[check];

                    newArray[check] = newArray[check + 1];

                    newArray[check + 1] = temp;

                }

            }
        }
            return newArray;
    }
    
    
    
   
}

