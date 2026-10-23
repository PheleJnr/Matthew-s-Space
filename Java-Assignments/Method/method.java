public class method {

    public static void main(String[] args){

    printWelcomeMessage();
    System.out.println(doubleIt(4));
    System.out.println(isNegative(3));
    printTimeTable(9);
    System.out.println(average (30, 40, 60));
    System.out.println(isRange(6,7,10));

}

    public static void printWelcomeMessage (){

    String welcomeMessage = "Welcome to Java";
    System.out.println(welcomeMessage);
    
}


    public static int doubleIt (int n){

    int twice = n * 2;
    return twice;

}

    public static boolean isNegative (int n){
    
    boolean result;

    if (n < 0)
        return true;
    return false;
    
}
    public static void printTimeTable (int n){
    
    int counter = 0;
    
    for (int count = 1; count <= 1000; count++){

        if (count % n == 0){
            
            
        if (counter == 5){
           break;  
        }

          System.out.print(count + ",");
          counter++;          
   }   
 
}
 System.out.println(); 
}


    public static int average (int a, int b, int c) {
    
    int averageNumber = (a + b + c) / 3;

    return averageNumber;

}

    public static boolean isRange (int n, int low, int high){

    if (n >= low && n <= high){
        return true;
}
        return false;

}

}