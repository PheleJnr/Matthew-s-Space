import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



public class ArrayTest{

    @Test

    public void testThatIHaveAnArrayOfNumbersTheLargestIsTheLargestInTheArray(){

	    
    int [] numbers = {2, 5, 1, 9 ,7};

	    
	int expectedRange = Array.findSmallestNumber(numbers);

	int actualRange = 9;

	    
	assertEquals(actualRange, expectedRange);
	    
    }
	
	
}



