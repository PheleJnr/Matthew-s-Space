import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


    public class SumOfNumbersTest {
    
    
        @Test 
        
        public void testThatIfIEnterANumberIGetTheSumOfTheNumberFromOneToTheNumber(){
        
            //Given/Arrange
            int number = 5;
            
            //When/Act
            int expectedSum = SumOfNumbers.sumFromOneTo(number);
            
            int actualSum = 15;
            
            //Check/Assert
            assertEquals(expectedSum, actualSum);
        
        }   
    
    
    
    
    
    }
    
    
