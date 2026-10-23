package practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPractice {

    @Test
    public void testForTheLargestNumberInTheArray(){
        //given
        int[] numbers = {8, 10, 24};

        //when
        int expected = Practice.findLargestNumber(numbers);
        int actual = 24;

        //check
        assertEquals(expected, actual);

    }

    @Test
    public void testForTheMultiplesOfTheLowestCommonNumberInTheArray(){
        //given
        int[] numbers = {8, 10, 24};

        //when
        int expected = Practice.getLowestCommonMultiple(numbers);
        int actual = 120;

        //check
        assertEquals(expected, actual);

    }
}
