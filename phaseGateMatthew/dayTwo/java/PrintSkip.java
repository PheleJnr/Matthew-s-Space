public class PrintSkip{

    public static void main(String[] args){
   
        for(int count = 1; count <= 100; count++){
        
            if (count % 3 == 0){
            
                System.out.println("Skip ");
                
            } else{
            
                System.out.println(count);
            }
        
        }
          
    }
    
}   
