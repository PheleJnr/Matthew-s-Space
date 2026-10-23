public class SumOfArrays {

    public static int[] addTwoNumberTogetherInTheArrayElement(int[] array){
        int[] newArray;
    
        if (array.length % 2 == 0){
        
             newArray = new int[array.length / 2];
            
        }else{
        
            newArray = new int[array.length / 2 + 1];
        }
        
        int sum = 0;
        int count;
        
        for(count = 0; count < array.length - 1; count += 2){
        
            newArray[sum] = array[count] + array[count + 1];
            
            sum++;
        
        }
    
        if (count < array.length){
        
            newArray[sum] = array[count];
        }
    
    return newArray;
    }


}   
    
    
    
    
    
