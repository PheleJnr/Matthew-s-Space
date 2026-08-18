public class PrintPyramidStars {

    public static void main(String[] args) {

    int m = 4;
for (int i = 1; i <= m; i++){
    
    for (int k = 1; k <= m - i; k++){
        System.out.print(" ");
     }

    for(int j = 1; j <= ((2 * i) - 1); j++) {
        System.out.print("*");



    }

    System.out.println();

}





}

}
