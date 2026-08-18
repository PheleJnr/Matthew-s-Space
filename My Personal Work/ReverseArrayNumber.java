import java.util.Arrays;
public class ReverseArrayNumber{

    public static void main(String[] args){
    
//    int [] number = {5,8,9,8,4};
//
//    for(int count = 0; count < number.length / 2; count++){
//            int temp = number[count];
//            number[count] = number[number.length - 1 - count];
//            number[number.length - 1 - count] = temp;
//       }
//       
//           System.out.println(Arrays.toString(number));   
//           
//    
//     }
//  
//} 




    int [] number = {2,5,8,9,8,4,5,7,8,7,9,2,3,3,2};
    
          
        
        for(int count = 0; count < number.length; count++){
    
           int counter = 1;
    
            for(int index = count + 1; index < number.length; index++){
        
                if (number[count] == number[index]){
                
                    counter++;
            
            
                }
    
    
    
        }g
       
    
        System.out.println(number[count] + " occurs " + counter++ + " times");
    
    }

    
    }
    
}
    









