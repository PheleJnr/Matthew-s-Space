public class IfStatement{

    public static void main(String[] args) {
    
//    int number = 0;
//
//    if (number >= 0) {
//        System.out.println("The number is positive");
//     }
//
//     
//    int studentScore = 50;
//
//    if (studentScore >= 50){
//        System.out.println("You passed the exam");
//
//}
//
//
//    int age = 18;
//    if (age >= 18){
//        System.out.println("You can vote");
//
//}
//
//
//    int number4 = 10;
//
//    if (number4 % 2 == 0){
//        System.out.println("Even");
//
//    } else{
//           System.out.println("Odd"); 
//    }
//
//
//    int adeAge = 12;
//
//    if (adeAge >= 18){
//        System.out.println("Adult");
//    
//    }else {
//        System.out.println("Minor");
//}
//
//    
//    int number6 = -17;
//    
//    if (number6 > 0){
//        System.out.println("Positive");
//    
//    }else {
//        System.out.println("Non-Positive");
//    }
//
//    int year = 2028;
//
//    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
//        System.out.println("It''s a leap year");
//    
//    }else {
//        System.out.println("It's not a leap year");
//    }
//
//
//
//    int studentScores = 45;
//
//    if (studentScores >= 90){
//        System.out.println("A");
//        
//    }else if (studentScores >= 80 && studentScores <= 89){
//        System.out.println("B");
//    
//    }else if (studentScores >= 70 && studentScores <= 79){
//        System.out.println("C");
//
//    }else if (studentScores >= 60 && studentScores <= 69){
//        System.out.println("D");
//
//
//    }else if (studentScores < 60){
//        System.out.println("F");
//        
//    }
//
//
//   int number9 = 0;
//
//    if (number9 > 0){
//        System.out.println("Positive");
//
//    }else if (number9 < 0){
//        System.out.println("Negative");
//
//    } else if (number9 == 0){
//        System.out.println("Zero");
//    }
//
//    int personAge = 20;
//
//    if (personAge <= 12){
//        System.out.println("Child");
//    
//    }else if (personAge <= 19){
//        System.out.println("Teenager");
//
//    }else {
//        System.out.println("Adult");
//
//    }
//
//    int number11 = -15;
//
//    if (number11 > 0){
//        
//        if(number11 % 2 == 0){
//            System.out.println("The number is Positive and Even");
//        }else {
//            System.out.println("The number is Positive and Odd");
//        }
//        
//    }else {
//        System.out.println("The number is not Positive");
//
//
//    }
//
//
//    int voteAge = 20;
//    boolean isCitizen = false;
//
//    if (voteAge >= 18){
//
//        if (isCitizen){
//            System.out.println("The User is a citizen and eligible to vote");
//        
//        }else {
//            System.out.println("The User is not a Citizen and cannot vote");
//        
//        }
//
//    }else {
//        System.out.println("The User is not eligible to vote");
//
//    }
//
//
//    int a = 65;
//    int b = 40;
//    int c = 50;
//
//    if (a >= b){
//
//        if (a >= c){
//            System.out.println("The largest Number is " + a);
//        }else {
//
//            System.out.println("The largest Number is " + c);
//        }
//
//    }else {
//
//        if (b >= c){
//            System.out.println("The largest number is " + b);
//        }else {
//            System.out.println("The largest number is " + c);
//
//        }
//
//    }
//
//

    int side1 = 80;
    int side2 = 50;
    int side3 = 50;

    if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1){
        
        if (side1 == side2 && side2 == side3){
            System.out.println("The traingle is equilateral");
        
        }else if (side1 == side2 || side2 == side3 || side1 == side3){
            System.out.println("The triangle is Isocles");

        }else {
            System.out.println ("The triangle is Scalene");
    
        }

    }else {
        System.out.println("The triangle is not Valid");

    }



    int number = -19;

    if (number > 0){
        
        if (number < 18.5){
            System.out.println("The BMI is Underweight");

        }else if (number > 18.5 && number <= 24.9){
            System.out.println("The BMI is Normal"); 

        }else if (number > 25 && number <= 29.9){
            System.out.println("The BMI is Overweight");

        }else{
            System.out.println ("The BMI is Obese");
        }


    }else {
            System.out.println ("The Number input is Negative");
        }


}

}
