import java.util.Scanner;

    public class AssignGrades{
    
        public static void main(String[] args){
      
        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter the number of students: ");
        
        int numberOfStudents = input.nextInt();
        
        int scoresOfStudents[] = new int [numberOfStudents];
        
        System.out.print("Enter " + numberOfStudents + " scoresOfStudents: " );
        
        for (int count = 0; count < scoresOfStudents.length; count++){
        
            scoresOfStudents[count] = input.nextInt();
        
        }
        
        
        int bestScores = 0;
        
        for (int count = 0; count < scoresOfStudents.length; count++){
        
            if (scoresOfStudents[count] > bestScores){
            
                 bestScores = scoresOfStudents[count];
            }
        
        }
        
        for (int count = 0; count < scoresOfStudents.length; count++){
            
            char grade;
            
            if (scoresOfStudents[count] >= bestScores - 10){
                
                grade = 'A';
            
            }else if (scoresOfStudents[count] >= bestScores - 20){
                
                grade = 'B';
                            
            }else if (scoresOfStudents[count] >= bestScores - 30){
                
                grade = 'C';
                           
            }else if (scoresOfStudents[count] >= bestScores - 40){
                
                grade = 'D';
            
            }else{
            
                grade = 'F';
            }
        
        System.out.println("Student " + count + " Score is " + scoresOfStudents[count] + " and grade is " + grade);
        }
        
        
        
        }
        
        
    }   
