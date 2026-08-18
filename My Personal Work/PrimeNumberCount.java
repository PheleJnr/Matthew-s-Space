public class PrimeNumberCount {

    public static void main (String[] args){
    
    
        int primeNumberCount = 0;
        
        int printedNumbers = 0;
        

    
        for (int number = 1; number <= 100; number++){
    
            primeNumberCount = 0;
    
            for (int check = 1; check <= number; check++){
        
                if(number % check == 0){
                
                    primeNumberCount++;
                }    
            }
            
            if (primeNumberCount == 2){
                printedNumbers++;

                System.out.printf("%d ", number);
               
            }
            
            if(printedNumbers == 10)break;
    
        
        
       }
//        System.out.println(printedNumbers);
        
    }
    
}
