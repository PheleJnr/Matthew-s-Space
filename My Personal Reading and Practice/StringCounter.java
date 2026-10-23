public class StringCounter{

    public static int numberOfOccurence(String word, char letter){
    
        int counter = 0;
        
        for(int count = 0; count < word.length(); count++){
            
            if(word.charAt(count) == letter){
            
                counter++;
            }
        }
        return counter;   
    }
    
    public static void main(String[] args){
    
    String word = "Village People";
    
    char letter = 'e';
    
    System.out.println(numberOfOccurence(word, letter));
    
    }    

}


