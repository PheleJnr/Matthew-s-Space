

public class EvenAndOddNumber{

    public static int[] makeEvenAndOddNumberReturnZerosAndOnes(int[] array){
    
        int[] newArray = new int [array.length];
              
        for(int count = 0; count < array.length; count++){
        
            if (array[count] % 2 == 0){
                                            
                newArray[count] = 1;
                
            
            }else {
            
                newArray[count] = 0;
              
            }
        
      }
      
    return newArray;
    }
    
   
    public static boolean[] makeEvenAndOddNumberReturnTrueAndFalse(int[] array){
   
        boolean[] newArray = new boolean [array.length];
        
        for(int count = 0; count < array.length; count++){
        
            if(array[count] % 2 == 0){
            
                newArray[count] = false; 
                
            }else {
            
                newArray[count] = true;
            }
        
        
        }
             
        return newArray;
   
    }

}



