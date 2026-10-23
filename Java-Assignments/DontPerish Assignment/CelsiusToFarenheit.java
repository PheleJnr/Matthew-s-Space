//import scanner to collect input from user 
//Declare your main method
//Declare the method name
//claculate for farenheit using the formular
//return farenheit
//then display


import java.util.Scanner;

    public class CelsiusToFarenheit {

        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Temperature in Celcius: ");
        double number = input.nextInt();

        System.out.println(temperatureConvert(number));


}


        public static double temperatureConvert(double celcius){
    
    
        double farenheit = (celcius * 1.8) + 32;
        return farenheit;


}

}






























