import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



public class ArrayTest{

    @Test

    public void testThatIHaveAnArrayOfNumbersTheLargestIsTheLargestInTheArray(){

	    
    int [] numbers = {2, 5, 1, 9 ,7};

	    
	int expectedRange = Array.calculateRangeOf(numbers);

	int actualRange = 8;

	    
	assertEquals(actualRange, expectedRange);
	    
    }
	
	
}



