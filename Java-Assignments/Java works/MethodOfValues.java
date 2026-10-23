public class MethodOfValues {   

    public static void main(String[] args) {

    arithmeticOperators(10, 5, '*');


    }
    
    public static double addition(double number1, double number2) {

    double sum = 0;

    sum = number1 + number2;

    return sum;
    }
    



    public static double subtraction(double number1, double number2){

    double subtract = 0;

    subtract = number1 - number2;

    return subtract;
    }
    



    public static double division(double number1, double number2){

    double divide = 0;

    divide = number1 / number2;

    return divide;
    }




    public static double multiplication(double number1, double number2){

    double multiply = 0;

    multiply = number1 * number2;

    return multiply;
    }
    
    public static void arithmeticOperators(double number1, double number2, char operator) {

    switch(operator){
        case '+' : System.out.println(addition(number1, number2)); break;
        case '-' : System.out.println(subtraction(number1, number2)); break;
        case '/' : System.out.println(division(number1, number2)); break;
        case '*' : System.out.println(multiplication(number1, number2)); break;

        default  : System.out.print("invalid operator inputted");

      
            }

    }




}



























