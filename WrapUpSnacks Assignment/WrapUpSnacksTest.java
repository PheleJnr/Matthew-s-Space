import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class WrapUpSnacksTest{


   @Test
   void factorialOfZeroIsOne(){
   
      assertEquals(1, WrapUpSnacks.factorial(0));
   }

   @Test
   void factorialOfFiveIsCorrect(){
   
      assertEquals(120, WrapUpSnacks.factorial(5));
   }

  
   @Test
   void gcdOfTwelveAndEighteenIsSix(){
   
      assertEquals(6, WrapUpSnacks.greatestCommonDivisor(12, 18));
   }

   @Test
   void gcdOfCoprimeNumbersIsOne(){
   
      assertEquals(1, WrapUpSnacks.greatestCommonDivisor(7, 13));
   }

 
   @Test
   void lcmOfFourAndSixIsTwelve(){
   
      assertEquals(12, WrapUpSnacks.lowestCommonDivisor(4, 6));
   }

   @Test
   void lcmOfEqualNumbersIsTheNumberItself(){
   
      assertEquals(5, WrapUpSnacks.lowestCommonDivisor(5, 5));
   }

   
   @Test
   void sixIsAPerfectNumber(){
   
      assertTrue(WrapUpSnacks.isPerfectNumber(6));
   }

   @Test
   void twentyEightIsAPerfectNumber(){
   
      assertTrue(WrapUpSnacks.isPerfectNumber(28));
   }

   @Test
   void tenIsNotAPerfectNumber(){
   
      assertFalse(WrapUpSnacks.isPerfectNumber(10));
   }


   @Test
   void oneFiftyThreeIsAnArmstrongNumber(){
  
      assertTrue(WrapUpSnacks.isArmstrongNumber(153)); 
   }

   @Test
   void nineHundredIsNotAnArmstrongNumber(){
   
      assertFalse(WrapUpSnacks.isArmstrongNumber(900));
   }

   
   @Test
   void countArmstrongInRangeOneToOneThousandIsCorrect(){
   

      assertEquals(13, WrapUpSnacks.countArmstrongInRange(1, 1000));
   }

   @Test
   void findArmstrongInRangeIncludesOneFiftyThree(){
   
      int[] result = WrapUpSnacks.findArmstrongInRange(100, 999);

      boolean found = false;
      
      for (int count = 0; count < result.length; count++){
      
         if (result[count] == 153){
         
            found = true;
            
         }
         
      }
      

      assertTrue(found);
   }
   
   

  
   @Test
   void countPerfectInRangeOneToOneThousandIsThree(){
   
  
      assertEquals(3, WrapUpSnacks.countPerfectInRange(1, 1000));
   }

   @Test
   void findPerfectInRangeMatchesKnownValues(){
   
      int[] result = WrapUpSnacks.findPerfectInRange(1, 1000);

      assertEquals(6, result[0]);
      assertEquals(28, result[1]);
      assertEquals(496, result[2]);
   }

   
   @Test
   void oneFourFiveIsAStrongNumber(){
   
      assertTrue(WrapUpSnacks.isStrongNumber(145)); 
   }

   @Test
   void oneTwoThreeIsNotAStrongNumber(){
   
      assertFalse(WrapUpSnacks.isStrongNumber(123));
   }


   @Test
   void countLeapYearsBetweenNineteenHundredAndTwoThousandTwentyFive(){
   
      assertEquals(31, WrapUpSnacks.countLeapYearsInRange(1900, 2025));
   }

   @Test
   void findLeapYearsExcludesNineteenHundred(){
   

      int[] result = WrapUpSnacks.findLeapYearsInRange(1900, 1904);

      assertEquals(1, result.length); 
      
      assertEquals(1904, result[0]);
   }

   @Test
   void year2000IsALeapYear(){
   
      
      int[] result = WrapUpSnacks.findLeapYearsInRange(1999, 2001);

      assertEquals(1, result.length);
      assertEquals(2000, result[0]);
      
   }
   
}























   
