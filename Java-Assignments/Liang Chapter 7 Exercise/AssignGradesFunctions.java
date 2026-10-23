import java.util.Scanner;

    public class AssignGradesFunctions{
    
        public static void main(String[] args){
        
        Scanner input = new Scanner (System.in);
        
        int[] scores = readScores(input);
        int bestScores = findBestScores(scores);
        printGrades(scores, bestScores);
        
        
        
        
        
        }
        
        public static int[] readScores(Scanner input){
                
        System.out.print("Enter the number of Students: ");
        int numberOfStudents = input.nextInt();
        
        int[] scores = new int [numberOfStudents];
        System.out.print("Enter " + numberOfStudents + " Scores of students: ");
        
        for (int count = 0; count < scores.length; count++){
            
            scores[count] = input.nextInt();
        
        }
        return scores;
        }
        
        
    
        public static int findBestScores(int[] scores){
        
        int bestScores = 0;
        
        for (int count = 0; count < scores.length; count++){
        
            if (scores[count] > bestScores){
                
                bestScores = scores[count];
            
            }
        
        }     
    
        return bestScores;
        }
    
    
        public static void printGrades(int[] scores, int bestScores){
        
        for (int count = 0; count < scores.length; count++){
        
        char grade;
        
            if (scores[count] >= bestScores - 10){
                
                grade = 'A';
            
            }else if (scores[count] >= bestScores - 20){
                
                grade = 'B';
                            
            }else if (scores[count] >= bestScores - 30){
                
                grade = 'C';
            
            }else if (scores[count] >= bestScores - 40){
                
                grade = 'D';
                            
            }else {
                
                grade = 'F';
            
            } 
            
        System.out.println("Student " + count + " score is " + scores[count]
                + " and grade is " + grade);          
        }
        
               
        }
    
}     
       
       
       
       
       

