public class StatisticsCalculator{




	public static int calculateRangeOf(int[] numbers){
	
		return findLargestNumberIn(numbers) - findSmallestNumberIn(numbers);

	}


	public static int findLargestNumberIn(int[] numbers){
		int largest = numbers[0];
		for(int index = 0; index < numbers.length; index++){
			if(numbers[index] > largest)
				largest = numbers[index];
		}
		return largest;
	}

	public static int findSmallestNumberIn(int[] numbers){
		int smallest = numbers[0];
		for(int index = 0; index < numbers.length; index++){
			if(numbers[index] < smallest)
				smallest = numbers[index];
		}
		return smallest;
	}

    public static int calculateAverageOf(int[] arrayOfNumbers){

	 	int sum = 0;

        int average = 0;


	 	for(int count = 0; count < numbers.length; count++) {
	 		sum += numbers[count];

            average = sum / numbers.length;
	 	}
	 	
        return average;
	 }


    
    public static int calculateMedianOf(int[] numbers){




    public static int sortingArrayNumbersIn(int[] numbers){

               
        for (count = 0; count < numbers.length-1; count++){
        
            for (check = 0; check < (numbers.length-1) - 1; check++){
            
                 if (numbers[check] < numbers[check + 1]){
                 
                    int temp = numbers[check];
                    
                    numbers[check] = numbers[check + 1];
                    
                    numbers[check + 1] = temp;
                 
                 }
            
            
            }
        
        
        
        
        }        

        return numbers;
    }


    

    }


    





//public static int sortingArrayNumbersIn(int[] numbers){
//
//               
//        for (count = 0; count < numbers.length-1; count++){
//        
//            for (check = 0; check < (numbers.length-1) - 1; check++){
//            
//                 if (numbers[check] < numbers[check + 1]){
//                 
//                    int temp = numbers[check];
//                    
//                    numbers[check] = numbers[check + 1];
//                    
//                    numbers[check + 1] = temp;
//                 
//                 }
//            
//            
//            }
//        
//        
//        
//        
//        }        
//
//        return numbers;
//    }
//
//
//
//
//
//











}
