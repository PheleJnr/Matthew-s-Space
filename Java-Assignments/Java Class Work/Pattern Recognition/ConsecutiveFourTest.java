import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    public class ConsecutiveFourTest{
    
        @Test
        
        public void testThatTheArrayHasFourConsecutiveNumbersWithSameValue(){
        
        int[] value = {5, 5, 5, 5, 8, 9, 10};
        
        boolean expected = ConsecutiveFour.isConsecutiveFour(value);
                
        boolean actual = true;
                
        assertEquals(expected, actual);
                
    
        }
    
    
    
    
    }
