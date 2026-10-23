import java.util.Scanner;

public class FatherSonAge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter father's current age (1-80): ");
        int fatherAge = input.nextInt();

        System.out.print("Enter son's current age (1-80): ");
        int sonAge = input.nextInt();

        int years = 0;

        if (fatherAge == 2 * sonAge) {
            System.out.println("Father is already twice as old as his son.");
            return; 
        }

        int pastFather = fatherAge;
        int pastSon = sonAge;
        int pastYears = 0;

        while (pastSon >= 0) {
            if (pastFather == 2 * pastSon) {
                System.out.println(pastYears + " years ago, father was twice as old as his son.");
                return; 
            }
            pastFather--;
            pastSon--;
            pastYears++;
        }
       
        int futureFather = fatherAge;
        int futureSon = sonAge;
        int futureYears = 0;

        while (true) {
            futureFather++;
            futureSon++;
            futureYears++;

            if (futureFather == 2 * futureSon) {
                System.out.println("In " + futureYears + " years, father will be twice as old as his son.");
                break; 
            }
        }
    }
}