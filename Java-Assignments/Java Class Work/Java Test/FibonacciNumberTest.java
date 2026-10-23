import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FibonacciNumberTest{


    @Test

    public void testThatPositveNumbersInArray_countAsFibonacciNumbers(){

    int number = 13;

    int[] expectedNumber = FibonacciNumber.getFibonacciNumbers(number);

    int[] actualNumber = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144};

    assertArrayEquals(actualNumber, expectedNumber);
    }
    
    
    @Test

    public void testThatNegativeNumbersInArray_doesNotCountAsFibonacciNumbers(){
    
    int number = 0;
    
    int[] expectedNumber = FibonacciNumber.getFibonacciNumbers(number);

    int[] actualNumber = {};

    assertArrayEquals(actualNumber, expectedNumber);
    }
    
    
    }
























