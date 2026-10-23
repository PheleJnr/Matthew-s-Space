import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    public class StrictlyIdenticalArrayTest{
    
    
        @Test
        
        public void testThatTheFirstArrayIsStrictlyidenticalToTheSecondArray() {
        
            int[] arrayList1 = {3,5,7,8,9};
            int[] arrayList2 = {3,5,7,8,9};
            
            boolean expected = StrictlyIdenticalArray.isEquals(arrayList1, arrayList2);
            
            boolean actual = true;
            
            assertEquals(expected, actual);
            
            
        
        
        
        
        
        }
      
    
    
    
    }
