public class AdditionMethod {

    public static void main(String[] args) {

    System.out.println("Sum from 1 to 10 is " + sum(1, 10));
    System.out.println("Sum from 20 to 37 is " + sum(20, 37));
    System.out.println("Sum from 35 to 49 is " + sum(35, 49));


}


public static int sum(int number1, int number2) {
    int result = 0;
    for (int number = number1; number <= number2; number++)
        result += number;
    return result;
}


}




