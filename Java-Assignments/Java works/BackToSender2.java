import java.util.Scanner;

public class BackToSender2 {

    public static int calculateWage(int successfulDelivery) {
        int basePay = 5000;
        int wage;

        if (successfulDelivery >= 70) {
            wage = successfulDelivery * 500 + basePay;

        } else if (successfulDelivery >= 60 && successfulDelivery <= 69) {
            wage = successfulDelivery * 250 + basePay;

        } else if (successfulDelivery >= 50 && successfulDelivery <= 59) {
            wage = successfulDelivery * 200 + basePay;

        } else {
            wage = successfulDelivery * 160 + basePay;
        }

        return wage;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of successful delivery: ");
        int successfulDelivery = scanner.nextInt();

        int wage = calculateWage(successfulDelivery);
        System.out.println("the wage of the rider for the day: " + wage);

        
    }
}
