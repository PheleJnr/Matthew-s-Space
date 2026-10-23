import java.util.Scanner;

    public class BackToSender {

        public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the number of succesful delivery: ");
        int successfulDelivery = userInput.nextInt();


        int basePay = 5000;

        if (successfulDelivery >= 70) {
            System.out.println("the wage of the rider for the day: " + (successfulDelivery * 500 + basePay));

        } else if (successfulDelivery >= 60 && successfulDelivery <= 69) {
            System.out.println("the wage of the rider for the day: " + (successfulDelivery * 250 + basePay));

        } else if (successfulDelivery >= 50 && successfulDelivery <= 59) {
            System.out.println("the wage of the rider for the day: " + (successfulDelivery * 200 + basePay));

        } else {
            System.out.println("the wage of the rider for the day: " + (successfulDelivery * 160 + basePay));
        }

        
    }
}

