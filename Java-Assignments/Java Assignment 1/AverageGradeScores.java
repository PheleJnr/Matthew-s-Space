import java.util.Scanner;

public class AverageGradeScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter score 1: ");
        int score1 = input.nextInt();

        System.out.print("Enter score 2: ");
        int score2 = input.nextInt();

        System.out.print("Enter score 3: ");
        int score3 = input.nextInt();

        double average = (double) (score1 + score2 + score3) / 3;

        char grade;

        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        
        System.out.printf("Average score: %.2f%n", average);
        System.out.println("Letter grade: " + grade);
    }
}