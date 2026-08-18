public class FibonacciNumber {

     


        public static int[] getFibonacciNumbers(int number){
        
        int[] array = new int [number];
        
        array[0] = 0;
        array[1] = 1;
        
            for (int counter = 0; counter < array.length; counter++){
                array[counter] = array[counter - 1] + array[counter - 2];
        
            }
        
        
        
        return array;
        }



}

































