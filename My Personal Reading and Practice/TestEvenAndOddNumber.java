import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    public class TestEvenAndOddNumber{
    
    @Test
    public void testThatTheEvenNumbersReturnsOnesAndOddNumbersReturnZeros(){
    
    int[] array = {3,5,2,8,1,5};
    
    int[] expectednewArray = EvenAndOddNumber.makeEvenAndOddNumberReturnZerosAndOnes(array);
    
    int[] actualnewArray = {0,0,1,1,0,0};
    
    assertArrayEquals(expectednewArray, actualnewArray);
    
    
    
    }
    
    
     @Test
    public void testThatTheEvenNumbersReturnsFalseAndOddNumbersReturnTrue(){
    
    int[] array = {3,5,2,8,1,5};
    
    boolean[] expectednewArray = EvenAndOddNumber.makeEvenAndOddNumberReturnTrueAndFalse(array);
    
    boolean[] actualnewArray = {true,true,false,false,true,true};
    
    assertArrayEquals(expectednewArray, actualnewArray);
    
    
    
    }
    
    
    
    
    
}    
