import java.util.Scanner;

public class QuadrantFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Integer x: ");
        int x = input.nextInt();

        System.out.print("Enter Integer y: ");
        int y = input.nextInt();

        String location;

        if (x == 0 && y == 0) {
            location = "Origin";

        } else if (y == 0 && x != 0) {
            location = "X-axis";

        } else if (x == 0 && y != 0) {
            location = "Y-axis";

        } else if (x > 0 && y > 0) {
            location = "Q1";

        } else if (x < 0 && y > 0) {
            location = "Q2";

        } else if (x < 0 && y < 0) {
            location = "Q3";

        } else {
            location = "Q4";
        }

        System.out.println("Location: " + location);
    }
}