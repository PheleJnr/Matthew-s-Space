public class IfElseStatement {

    public static void main(String[] args) {

    int num = 0;


    if (num > 0) {

        if (num % 5 == 0) {
            System.out.println("The number is Positive and a multiple of 5");

        }else 
            System.out.println("The number is Positive but not a multiple of 5");
    
    }else if (num < 0) {
            System.out.println("The number is negative");

    }else {
            System.out.println("The number is zero");

    }




    double amount = 150;
    
    double discountPercent;
    
    double finalPrice;
    
    if (amount > 200){
        discountPercent = 20;
           
    }else if (amount > 100){
        discountPercent = 10;
        
    }else {
        discountPercent = 0;

    }    
    
    finalPrice = amount - (amount * discountPercent / 100);

    System.out.println ("The amount purchased is " + amount);
    System.out.println ("The discount is " + discountPercent + "%");
    System.out.println ("The Final Price after discount is $" + finalPrice);



    
    int age = 11;

    boolean hasTicket = true;

    boolean hasAdult = false;

    if (age < 13){

        if (hasAdult){
            System.out.println("The child is allowed");
        
        }else {
            System.out.println("The child is not allowed");
        }

    }else if (age > 13){

        if (hasTicket){
            System.out.println("There is valid Ticket");
        
        }else {
            System.out.println("There is no valid Ticket");
        }

    }else {
        System.out.println ("There is no adult");

    }



    int angleA = 120;
    int angleB = 80;
    int angleC = 30;

    if (angleA + angleB + angleC == 180){

        if (angleA < 90 && angleB < 90 && angleC < 90){
            System.out.println("The Triangle is an Acute angle Triangle");

        }else if (angleA == 90 || angleB == 90 || angleC == 90){
            System.out.println("The Triangle is a Right angle Triangle");

        }else if (angleA > 90 || angleB > 90 || angleC > 90){
            System.out.println("The Triangle is an Obtuse angle Triangle");
                
        }


    }else {
        System.out.println("Invalid Triangle angles");
    
    }




    int month = 12;

    int day = 41;

    
    if (month >= 1 && month <= 12){

        if (day >= 1 && day <= 31){
            System.out.println("Valid date");
        
        }else {
            System.out.println("Invalid date");

        }

    }else {
        System.out.println ("Invalid month");

    }




    int year = 5;

    int ratings = 3;


    if (year >= 5){

        if (ratings >= 4){
            System.out.println("Bonus level: Gold");

        }else if (ratings < 4){
            System.out.println("Bonus level: Silver");

        }

    }else {
        if (ratings >= 4){
             System.out.println ("Bonus level: Bronze");

        }else {
             System.out.println ("No bonus this year");
        }
       

    }




}


}
