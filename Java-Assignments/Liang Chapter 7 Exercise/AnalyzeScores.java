import java.util.Scanner;

public class AnalyzeScores {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);

        double[] scores = new double[100];
        
        int count = 0;
        
        double sum = 0;

        System.out.print("Enter scores (negative number to end): ");
        
        double score = input.nextDouble();
        
        while (score >= 0) {
        
            scores[count] = score;
            
            sum += score;
            
            count++;
            
            score = input.nextDouble();
            
        }

        double average = sum / count;
        
        int aboveOrEqual = 0;
        
        int below = 0;
        
        for (int i = 0; i < count; i++) {
        
            if (scores[i] >= average)
            
                aboveOrEqual++;
                
            else
            
                below++;
                
        }

        System.out.println("Average is " + average);
        
        System.out.println("Number of scores above or equal to average: " + aboveOrEqual);
        
        System.out.println("Number of scores below average: " + below);
        
    }
    
}






