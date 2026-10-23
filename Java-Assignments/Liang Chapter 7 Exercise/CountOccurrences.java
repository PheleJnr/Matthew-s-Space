import java.util.Scanner;

public class CountOccurrences {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);

        int[] counts = new int[101]; 
        
        System.out.print("Enter the integers between 1 and 100: ");

        int number = input.nextInt();
        
        while (number != 0) {
        
            counts[number]++;
            
            number = input.nextInt();
            
        }

        for (int index = 1; index < counts.length; index++) {
        
            if (counts[index] == 1)
            
                System.out.println(index + " occurs 1 time");
                
            else if (counts[index] > 1)
            
                System.out.println(index + " occurs " + counts[index] + " times");
                
        }
        
    }
    
}
