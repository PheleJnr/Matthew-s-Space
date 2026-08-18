import java.util.Scanner;

public class NestedIf {

    public static void main (String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter Voter's age: ");
    int age = input.nextInt();

    boolean isCitizen = true;
    

    if (age >= 18){

        if (isCitizen){
            System.out.println("This user is a citizen and eligible to vote");

        }else {
            System.out.println("This user is not a citizen, hence cannot vote");
        
        }

    }else {
        
        System.out.println("This user is less than 18 years and is not eligible to vote");


    }
































}


}
