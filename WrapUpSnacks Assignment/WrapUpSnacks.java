import java.util.Scanner;


    public class WrapUpSnacks{
    
      
       public static int factorial(int number){
       
          int result = 1;

          for (int count = 2; count <= number; count++){
          
             result *= count;
          }

          return result;
          
       }

      
       public static int greatestCommonDivisor(int numberOne, int numberTwo){
       
          while (numberTwo != 0){
          
             int remainder = numberOne % numberTwo;
             
             numberOne = numberTwo;
             
             numberTwo = remainder;
          }

          return numberOne;
       }


       public static int lowestCommonDivisor(int numberOne, int numberTwo){
       
          int larger = (numberOne > numberTwo) ? numberOne : numberTwo;
          
          int multiple = larger;

          while (true){
          
             if (multiple % numberOne == 0 && multiple % numberTwo == 0){
             
                return multiple;
             }

             multiple += larger;
             
          }
          
       }
       
       
       
       public static boolean isPerfectNumber(int number){
       
          if (number <= 1){
          
             return false;
          }

          int sumOfDivisors = 0;

          for (int divisor = 1; divisor <= n / 2; divisor++){
          
             if (number % divisor == 0)
             
             {
                sumOfDivisors += divisor;
                
             }
             
          }

          return sumOfDivisors == number;
          
       }
       
       
       
       private static int countDigits(int number){
       
          int count = 0;

          while (number > 0){
          
             count++;
             
             number /= 10;
          }

          return count;
       }

       
       private static long raiseToPower(int base, int exponent){
       
          long result = 1;

          for (int count = 0; count < exponent; count++){
          
             result *= base;
          }

          return result;
       }

       
       public static boolean isArmstrongNumber(int number){
       
          int digitCount = countDigits(number);
          
          int original = number;
          
          long sum = 0;

          while (number > 0){
          
             int digit = number % 10;
             
             sum += raiseToPower(digit, digitCount);
             
             number /= 10;
          }

          return sum == original;
       }

       
       public static int countArmstrongInRange(int start, int end){
       
          int counter = 0;

          for (int count = start; count <= end; count++){
          
             if (isArmstrongNumber(count)){
             
                counter++;
             }
             
          }

          return counter;
       }
       

       public static int[] findArmstrongInRange(int start, int end){
       
          int[] result = new int[countArmstrongInRange(start, end)];
          
          int index = 0;

          for (int count = start; count <= end; count++){
          
             if (isArmstrongNumber(count)){
             
                result[index] = count;
                
                index++;
                
             }
             
          }

          return result;
          
       }
       
       
       
       


       public static int countPerfectInRange(int start, int end){
       
          int counter = 0;

          for (int count = start; count <= end; count++){
          
             if (isPerfectNumber(count)){
             
                counter++;
                
             }
             
          }

          return counter;
          
       }
       

       public static int[] findPerfectInRange(int start, int end){
       
          int[] result = new int[countPerfectInRange(start, end)];
          
          int index = 0;

          for (int count = start; count <= end; count++){
          
             if (isPerfectNumber(count)){
             
                result[index] = count;
                
                index++;
                
             }
             
          }

          return result;
          
       }
       
       
       

       
       public static boolean isStrongNumber(int number){
       
          int original = number;
          
          int sum = 0;

          while (number > 0){
          
             int digit = number % 10;
             
             sum += factorial(digit);
             
             number /= 10;
             
          }

          return sum == original;
          
       }
       
       
       
       

       
       private static boolean isLeapYear(int year){
       
          return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
       }

       
       
       public static int[] findLeapYearsInRange(int start, int end){
       
          int[] result = new int[countLeapYearsInRange(start, end)];
          
          int index = 0;

          for (int year = start; year <= end; year++){
          
             if (isLeapYear(year)){
             
                result[index] = year;
                
                index++;
                
             }
             
          }

          return result;
          
       }

       
       public static int countLeapYearsInRange(int start, int end)
       {
          int counter = 0;

          for (int year = start; year <= end; year++)
          {
             if (isLeapYear(year))
             {
                counter++;
             }
          }

          return counter;
       }


       private static void printArray(int[] array){
       
          for (int count = 0; count < array.length; count++){
          
             System.out.print(array[count]);

             if (count < array.length - 1){
             
                System.out.print(", ");
                
             }
             
          }

          System.out.println();
          
       }
       
       
       

       public static void main(String[] args){
       
          Scanner input = new Scanner(System.in);

         
          System.out.print("Enter a number to find its factorial: ");
          int userInput = input.nextInt();
          System.out.println(userInput + "! = " + factorial(userInput));

        
          System.out.print("\nEnter two numbers to find their GCD: ");
          int numberOne = input.nextInt();
          int numberTwo = input.nextInt();
          System.out.println("GCD of " + numberOne + " and " + numberTwo + " = " + greatestCommonDivisor(numberOne, numberTwo));

        
          System.out.print("\nEnter two numbers to find their LCM: ");
          int numberOne = input.nextInt();
          int numberTwo = input.nextInt();
          System.out.println("LCM of " + numberOne + " and " + numberTwo + " = " + lowestCommonDivisor(numberOne, numberTwo));

          
          System.out.print("\nEnter a number to check if it's perfect: ");
          int userInput = input.nextInt();
          System.out.println(userInput + " is perfect: " + isPerfectNumber(userInput));

         
          System.out.print("\nEnter a number to check if it's an Armstrong number: ");
          int userInput = input.nextInt();
          System.out.println(userInput + " is Armstrong: " + isArmstrongNumber(userInput));

          
          System.out.println("\nArmstrong numbers between 1 and 1000:");
          printArray(findArmstrongInRange(1, 1000));

         
          System.out.println("\nPerfect numbers between 1 and 1000:");
          printArray(findPerfectInRange(1, 1000));

        
          System.out.print("\nEnter a number to check if it's a strong number: ");
          int userInput = input.nextInt();
          System.out.println(strongInput + " is strong: " + isStrongNumber(userInput));

         
          System.out.println("\nLeap years between 1900 and 2025:");
          printArray(findLeapYearsInRange(1900, 2025));

        
          System.out.println("\nNumber of leap years between 1900 and 2025: "
             + countLeapYearsInRange(1900, 2025));

          
       }
       
    }
    
    
    
    
    
    
    
    
    
    
    
