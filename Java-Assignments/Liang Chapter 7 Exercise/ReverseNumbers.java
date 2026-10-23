import java.util.Scanner;

    public class ReverseNumbers {
        
        public static void main(String[] args) {
        
            Scanner input = new Scanner(System.in);

            int[] number = new int [3];
            
            System.out.print ("Enter a number: ");
            
            for (int count = 0; count < number.length; count++){
            
                number[count] = input.nextInt();
            }  
                
                          
             System.out.print("The Reverse numbers are: ");
                                     
             for(int count = number.length - 1; count >= 0; count--){
                             
                System.out.print(number[count] + " ");
                
            }

        }

    }




  







































