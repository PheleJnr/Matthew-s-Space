public class PrintStarsTriangle {

    public static void main(String[] args) {

    
    for (int i = 1; i <= 10; i++){

        for(int space = 10; space >= i; space--){
    
            System.out.print(" ");
        
        }
        for(int j = 1; j <= i; j++) {
    
            System.out.print("*");
    
        }
        System.out.println(" ");
    
    }



}

}



