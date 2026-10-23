//public class InitArray{
//
//    public static void main(String[] args){
//    
//        int[] array = new int[10];   //creating an array object
//        
//        System.out.printf("%s%8s%n", "index", "value");
//        
//        for(int count = 0; count < array.length; count++){
//        
//        System.out.printf("%5d%8d%n", count, array[count]);
//        
//        }
//    }
//    
//}



//public class InitArray{
//
//    public static void main(String[] args){
//    
//        int[] array = {10,20,30,40,50,60,70,80,90,99};  //creating and Initialising an array
//        
//        System.out.printf("%s%8s%n", "index", "value");
//        
//        for(int count = 0; count < array.length; count++){
//        
//        System.out.printf("%5d%8d%n", count, array[count]);
//        
//        }
//    }
//    
//}
//







//public class InitArray{
//
//    public static void main(String[] args){
//    
//        final int ARRAY_LENGTH = 10; //declare constant
//        
//        int[] array = new int[ARRAY_LENGTH];
//        
//        for (int count = 0; count < array.length; count++){
//        
//            array[count] = 2 + 2 * count;   
//        
//        }
//        
//        System.out.printf("%5s%8s%n", "index", "value");
//       
//       for (int count = 0; count < array.length; count++){
//       
//        System.out.printf("%5d%8d%n", count, array[count]);
//        
//       }
//   }
//     
//}   
        
        
        
//public class InitArray{
//
//    public static void main(String[] args){        
//        
//        int[] array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
//        
//        int total = 0;
//        
//        for(int count = 0; count < array.length; count++){
//        
//            total += array[count];
//        
//        }   
//        
//        System.out.printf("The total number of elements in the array are: %d%n", total);
//        
//    }
//        
//}   
      
      
      
//public class InitArray{
//
//    public static void main(String[] args){        
//        
//        int[] array = {8, 0, 8, 4, 0, 3, 7, 8, 9, 7, 8};
//        
//        System.out.println("Grade Distribution: ");
//        
//        for (int count = 0; count < array.length; count++){
//        System.out.println(count);
//            if (count == 10){
//            
//                System.out.printf("%5d: ", 100);
//                
//            }else{
//            
//                System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);
//            
//            }
//            
//            for (int stars = 1; stars < array[count]; stars++){
//            
//                System.out.print("*");    
//            }
//        
//       System.out.println(); 
//    }
//    
//    }
//    
//}
//            
        
import java.util.Arrays;
public class InitArray{

    public static void main(String[] args){  
        
         int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
         
         int evenCount = 0; 
         
         for (int count = 0; count < array.length; count++){
         
            if (count % 2 == 0){
            
                evenCount++;
            }
         
         }
         
         int[] newArray = new int[evenCount];
         
         int result = 0;
         
                  
         for(int count = 0; count < array.length; count++){
         
            if (array[count] % 2 == 0){
            
            newArray[result] = array[count] * 2;
            
                result++;
            
            }
                   
         }   
            
      System.out.println(Arrays.toString(newArray));  
    }
        
}   
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
