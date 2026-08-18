import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class StatisticsCalculatorTest{
	
	@Test

	public void testThatIHaveAnArrayOfNumbersTheLargestIsTheLargestInTheArray(){

	//Given
	int [] numbers = {3, 5, 7, 1, 25, 11, 18};

	//When
	int expectedRange = StatisticsCalculator.calculateRangeOf(numbers);

//	int largest = StatisticsCalculator.findLargestNumberIn(numbers);
	int actualRange = 24;

	//Check
	assertEquals(actualRange, expectedRange);



	}
	
    @Test

	public void testThatIHaveAnArrayOfNumbersTheAverageIsTheAverageOfTheArray() {

    
    //Given
    int [] numbers = {3, 5, 7, 1, 25, 11, 18};

    //When
    int expectedAverage = StatisticsCalculator.calculateAverageOf(numbers);

    int actualAverage = 10;

    //Check
    assertEquals(expectedAverage, actualAverage);

  
    }

    @Test

	public void testThatIHaveAnArrayOfNumbersTheMedianIsTheMedianOfTheArray() {

    //Given
    int [] numbers = {3, 5, 7, 9, 25, 11, 18};

    //When
    int expectedMedian = StatisticsCalculator.calculateMedianOf(numbers);

    int actualMedian = 1;

    //Check

    assertEquals(expectedMedian, actualMedian);


    }


}
