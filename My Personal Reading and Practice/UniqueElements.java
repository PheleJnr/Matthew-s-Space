public class UniqueElements{

    public static int[] getUniqueElement(int[] array){
    
        int uniqueCount = 0;
    
        for(int count = 0; count < array.length; count++){
        
            int occurrenceCounter = 0;
                    
            for(int index = 0; index < array.length; index++){
            
                if (index != count && array[index] == array[count]){
                
                    occurrenceCounter++;
                
                }
            
            }
            if(occurrenceCounter == 0){
            
                uniqueCount++;
            }
        
        }
        
        
        int[] newArray = new int [uniqueCount];
        
        int resultIndex = 0;
        
        int sum = 0;
                      
        for(int count = 0; count < array.length; count++){
            
        int occurrenceCounter = 0;
        
            for(int index = 0; index < array.length; index++){
            
                if(index != count && array[index] == array[count]){
                    
                    occurrenceCounter++;
                
                }
            }
            
            if(occurrenceCounter == 0){
            
                newArray[resultIndex] = array[count];
                
                resultIndex++;
                
                sum += array[count];
                          
            }
        }
        
     return newArray;   
    }
    
    
}
