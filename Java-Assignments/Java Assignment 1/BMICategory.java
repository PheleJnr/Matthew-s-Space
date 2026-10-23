import java.util.Scanner;

public class BMICategory {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in kilograms: ");
        double weight = input.nextDouble();

        System.out.print("Enter height in meters: ");
        double height = input.nextDouble();

        double bmi = weight / (height * height);

        String category;

        if (bmi < 18.5) {
            category = "Underweight";

        } else if (bmi <= 24.9) {
            category = "Normal";

        } else if (bmi <= 29.9) {
            category = "Overweight";

        } else {
            category = "Obese";
        }

        System.out.printf("Your BMI is: %.2f%n", bmi);
        System.out.println("Category: " + category);
    }
}