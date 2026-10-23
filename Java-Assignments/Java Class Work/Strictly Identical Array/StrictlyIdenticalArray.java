public class StrictlyIdenticalArray {

    
    
//    int[] arrayList1 = {3,5,7,8,9};
//    int[] arrayList2 = {3,5,7,8,9};
//    
    
    
    
    public static boolean isEquals(int[] arrayList1, int[] arrayList2){
    
        if (arrayList1.length != arrayList2.length)
        
            return false;

        for (int count = 0; count < arrayList1.length; count++) {
        
            if (arrayList1[count] != arrayList2[count])
            
                return false;
        }

        return true;
    }
}
        
        
        
        
             
    
    
    
    
    
    
    
    











