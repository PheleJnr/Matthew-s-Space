import java.util.Arrays;

public class InterweavedCharacter{

    public static void main(String[] args){
    
        String textOne = "Hello";
        
        char[] newTextOne = Character.toCharArray(textOne);
        
        String textTwo = "World";
        
        char[] newTextTwo = Character.toCharArray(textTwo);
        
        String interweaved = "";
                        
         char[] combine = newTextOne + newTextTwo;
         
         char[] array = Character.toCharArray[combine.length];
            
           for(int count = 0; count < combine.length(); count++){
            
                interweaved = combine[count] > combine[count + 5];
                
                       
        
            }
     System.out.println(interweaved);       
    }
    
}                
