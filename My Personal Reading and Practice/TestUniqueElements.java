import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    public class TestUniqueElements{
    
    @Test
    public void testThatTheUniqueElementsInTheArrayAppearsOnlyOnce(){
    
    int[] array = {1,2,3,2};
    
    int[] expectednewArray = UniqueElements.getUniqueElement(array);
    
    int[] actualnewArray = {1,3};
    
    assertArrayEquals(expectednewArray, actualnewArray);
    
    }
    
    
    @Test
    public void testThatTheUniqueElementsInTheArrayAppearsOnlyOnce2(){
    
    int[] array = {1,1,1,1,1};
    
    int[] expectednewArray = UniqueElements.getUniqueElement(array);
    
    int[] actualnewArray = {0};
    
    assertArrayEquals(expectednewArray, actualnewArray);
    }
    
    
}
    
