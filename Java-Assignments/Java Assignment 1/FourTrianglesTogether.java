public class FourTrianglesTogether {
    public static void main(String[] args) {

        
        for (int count = 1; count <= 10; count++) {

		for (int value = 1; value <= count; value++) {
                System.out.print('*');
            }
            		System.out.print(' ');
            		System.out.print(' ');

       		for (int value = count; value <= 10; value++) {
                System.out.print('*');
            }
            		System.out.print(' ');
            		System.out.print(' ');

       		for (int value = 1; value < count; value++) {
                System.out.print(' ');
            }
            	for (int value = count; value <= 10; value++) {
                System.out.print('*');
            }
            		System.out.print(' ');
           		System.out.print(' ');

            
            	for (int value = count; value <= 9; value++) {
                System.out.print(' ');
            }
            
            	for (int value = 1; value <= count; value++) {
                System.out.print('*');
            }

            
            System.out.println();
        }
    }
}