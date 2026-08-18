public class GreatestNumber{

    public static void main(String[] args){
    
    
    int number1 = 30;
    int number2 = 45;
    int divisor = 0;
   
    
//        for (int count = 1; count <= number1; count++){
//    
//            if (number1 % count == 0) {
//                     
//                System.out.println(count);
//                
//            }
//        }    
//    
// 
// 
//   
//        for (int count = 1; count <= number2; count++){
//    
//            if (number2 % count == 0) {
//                     
//                System.out.println(count);
//                
//            }
//        }    
//    }
// 
// 
//}   
//    


        for(int count = 1; count <= 45; count++){
        
            if(number1 % count == 0 && number2 % count == 0){
            
                divisor = count;
            }
        
        }
        
        System.out.println(divisor);
        
    }
 
} 
