import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SumOfArraysTest{


    @Test
    public void testForTheEvenLengthOfTheNewArray(){
    
        int[] array = {1,2,3,4};
        
        int[] expectednewArray = SumOfArrays.addTwoNumberTogetherInTheArrayElement(array);
        
        int[] actualnewArray = {3,7};
        
        assertArrayEquals(expectednewArray, actualnewArray);
        
       
    }
    
    
    @Test
    public void testForTheOddLengthOfTheNewArray(){
    
        int[] array = {1,2,3,4,5,6,7,8,9,10,11};
        
        int[] expectednewArray = SumOfArrays.addTwoNumberTogetherInTheArrayElement(array);
        
        int[] actualnewArray = {3,7,11,15,19,11};
        
        assertArrayEquals(expectednewArray, actualnewArray);
        
        
        } 
//    
//    
    
//    }
//    
//     
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//
//    @Test
//    public void testThatTwoElementsEachInTheArrayAddsTogether(){
//    
//    int[] array = {1,2,3,4,5,6};
//    
//    int[] expectedSum = SumOfArrays.addTwoNumberInTheArrayElement(array);
//    
//    int[] actualSum = {3,7,11};
//    
//    assertEquals(expectedSum, actualSum);
//    
//    
//    
//    }


    


}
