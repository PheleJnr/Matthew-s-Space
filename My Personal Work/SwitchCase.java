import java.util.Scanner;

    public class SwitchCase {

        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Students Scores: ");
        int scores = input.nextInt();

        switch(scores){

            case (scores > 90) : System.out.println("Letter Grade A"); break;
            case (scores > 80) : System.out.println("Letter Grade B"); break;
            case (scores > 70) : System.out.println("Letter Grade C"); break; 
            case (scores > 60) : System.out.println("Letter Grade D"); break;
            case (scores > 50) : System.out.println("letter Grade E"); break;
            case (scores < 49 ) : System.out.println("Letter Grade F"); break;
            default : System.out.println("Invalid Scores entry");
    
            }

}

}














