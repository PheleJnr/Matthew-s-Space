public class LeapYears {
    public static void main(String[] args) {
        int count = 0; 

        System.out.println("Leap years from 2000 to 2100:");

        for (int year = 2000; year <= 2100; year++) {
            
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.printf("%d ", year);
                count++; 
              
                if (count % 10 == 0) {
                    System.out.println(); 
                }
            }
        }

        System.out.println(); 
    }
}