import java.util.Arrays;


public class EvenOddCounter {

    public static void main(String[] args) {

    int[] num = {1, 2, 3, 4, 5};
    
    System.out.println(Arrays.toString(evenNumbersIn(num)));
    

}


    public static int[] evenNumbersIn(int[] num) {

        int counter = 0;

        for(int count = 0; count < num.length; count++) {

            if(num[count] % 2 == 0) {
	 			counter++;
	 		}
		
	 	}

	 	int[] even = new int[counter + 1];

	 	int counters = 0;

	 	for(int count = 0; count < num.length; count++) {
	 		
            if(num[count] % 2 == 0) {
                even[counters] = num[count];
	 			counters++;
	 		}
	 	}
        even[counter] = counter;
	 	return even;
	 }


}









