
//Printing from A to Z

//public class LearnChar{
//
//    public static void main(String[] args){
//    
//        for (char c = 'J'; c <= 'Z'; c++)
//    
//            System.out.printf("%c ", c);
//    
//      
//    }
//    
//    
//}

//comparing two string together using .equal()

//public class LearnChar{
//
//    public static void main(String[] args){
//    
//        String s1 = "cat";
//        String s2 = "cat";
//        
//        System.out.print(s1 == s2);
//        System.out.print(s1.equals(s2));
//    
//      
//    }
//    
//    
//}

//Looping through a words one by one 

//public class LearnChar{
//
//    public static void main(String[] args){
//    
//        String text = "hello world";
//        
//        char firstWord = word.charAt(0);
//        char secondWord = word.charAt(word.length() -1);
//        
//        System.out.printf("%c%n", firstWord);
//        System.out.printf("%c%n", secondWord);

//        for(char count = 0; count < word.length(); count++){
//        
//            char c = word.charAt(count);
//            
//            System.out.print(c);
//        
//        }
//         
//         
//         
//    }
//    
//    
//}


//counting the numbers of vowels in a text and the vowels in the text

//public class LearnChar{
//
//    public static void main(String[] args){
//    
//        String text = "hello world";
//       
//        int counter = 0;
//        
//        System.out.print("Vowels found: ");
//
//        for (int count = 0; count < text.length(); count++){
//        
//            char c = Character.toLowerCase(text.charAt(count));
//            
//            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
//            
//                System.out.print(c);
//                counter++;
//            }
//            
//        }       
//                
//       System.out.println();               
//       System.out.println("Number of Vowels: " + counter);         
//        
//    
//    }
//        
//
//}



//counting and printing the vowel at each index they belong in a text

//public class LearnChar{
//
//    public static void main(String[] args){
//    
//        String text = "hello world";
//       
//        int counter = 0;
//
//        for (int i = 0; i < text.length(); i++) {
//        
//            char c = Character.toLowerCase(text.charAt(i));
//            
//            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
//            
//                System.out.println("Vowel '" + c + "' at index " + i);
//                
//                counter++;
//            }
//        }    
//    System.out.println("the number of vowels: " + counter);
//    }
//
//}


//Collect the vowels into a String instead of printing directly


//public class LearnChar{
//
//    public static void main(String[] args){
//    
//        String text = "hello world"; 
//
//        String vowelsOnly = "";
//        
//        int counter = 0;
//                     
//        for (int count = 0; count < text.length(); count++){
//        
//            char c = Character.toLowerCase(text.charAt(count));
//        
//            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
//                
//                vowelsOnly += c;
//                counter++;
//            }
//        
//        }
//    System.out.println("The vowels: " + vowelsOnly);
//    System.out.println("The number of vowels: " + counter);    
//    }       
//
//}
//


//how to reverse the string words

//public class LearnChar{
//
//    public static void main(String[] args){
//    
//        String text = "hello world"; 
//        
//        String reversed = "";
//        
//        int counter = 0;
//        
//        for (int count = text.length()- 1; count >= 0; count--){
//            
//            reversed += text.charAt(count);
//        
//            counter++;
//        }
//    
//    System.out.println(reversed);    
//    System.out.println("The number of words: " + counter);
//    }
//
//}


//How to reverse in string text to char Array

//public class LearnChar{
//
//    public static void main(String[] args){
//    
//        String text = "hello world"; 
//        
//        char[] charArray = text.toCharArray();
//        
//        String reversed = "";
//                        
//        for (int count = charArray.length - 1; count >= 0; count--){
//            
//            reversed += charArray[count];
//        
//            
//        }
//    
//    
//    System.out.println(reversed);    
//   
//    }
//
//}
//

//How to convert a reversed string to CharArray and then move the left to the right 

//public class LearnChar{
//
//    public static void main(String[] args){
//    
//        String text = "hello world"; 
//        
//        char[] charArray = text.toCharArray();
//                  
//        int left = 0;
//        
//        int right = charArray.length - 1;
//        
//        
//        while (left < right){
//        
//            char temp = charArray[left];
//            
//            charArray[left] = charArray[right];
//           
//            charArray[right] = temp; 
//         
//            left ++;
//            right--;
//            
//        }
//    String newReversed = new String(charArray);
//    
//    System.out.print(newReversed);    
//    }
//    
//}



//How to pick only consonant and count it also

//public class LearnChar{
//
//    public static void main(String[] args){
//    
//        String text = "hello world"; 
//        
//        String isConsonantOnly = "";
//                 
//       int counter = 0;
//        
//        for (int count = 0; count < text.length(); count++){
//        
//            char alphabet = Character.toLowerCase(text.charAt(count));
//                                        
//            boolean isVowel = (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u');
//           
//                if (Character.isLetter(alphabet) && !isVowel){    
//                     
//                     isConsonantOnly += alphabet;
//                     
//                     counter++;
//         
//                } 
//            
//
//        } 
//    System.out.println(isConsonantOnly);
//           
//    System.out.println(counter);
//    }
//
//}
//


//How to pick out vowels and consonant and count them also out 

//public class LearnChar{
//
//    public static void main(String[] args){
//    
//        String text = "hello world"; 
//
//        String isVowel = "";
//        
//        String isConsonant = "";
//        
//        int vowelCounter = 0;
//        
//        int consonantCounter = 0;
//
//        for (int count = 0; count < text.length(); count++){
//        
//        char alphabet = Character.toLowerCase(text.charAt(count));
//        
//            if (Character.isLetter(alphabet)){
//            
//                if(alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u'){
//                    
//                    isVowel+= alphabet;
//                    vowelCounter++;
//                    
//                }else{
//                    
//                    isConsonant += alphabet;
//                    consonantCounter++;
//                }
//                
//                
//            }
//            
//            
//        }
//      System.out.println("The vowels are: " + isVowel);
//      System.out.println("The number of vowels are: " + vowelCounter);
//      System.out.println("The Consonants are: " + isConsonant);  
//      System.out.println("The number of consonant are: " + consonantCounter);  
//    }
//}       


//Removing the consonant from the word

//public class LearnChar{
//
//    public static void main(String[] args){
//
//
//    String word = "banana";
//    for (int i = 0; i < word.length(); i++) {
//        if (word.charAt(i) == 'a') continue;
//        System.out.print(word.charAt(i));
//    }
//
//    }
//
//}
//





//public class LearnChar{
//
//    public static void main(String[] args){
//    
//        String text = "Matthew is a good man";
//                       
//        String vowelsOnly = "";
//        
//        int counter = 0;
//        
//        for(int count = 0; count < text.length(); count++){
//        
//        char alphabet = Character.toLowerCase(text.charAt(count));
//        
//            if(alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u'){
//                
//                vowelsOnly += alphabet;
//                counter++;            
//            }
//            
//        
//            
//        
//        }
//        
//    System.out.println("The vowels in the text are: " + vowelsOnly);
//    System.out.println("The number of vowels in the text are: " + counter);
//    }
//
//
//}



//public class LearnChar{
//
//    public static void main(String[] args){
//    
//    String text = "Matthew is a good man";
//    
//    String consonant = "";
//    
//    int consonantCounter = 0;
//    
//        for(int count = 0; count < text.length(); count++){
//    
//        char alphabet = Character.toLowerCase(text.charAt(count));
//                        
//        boolean isVowel = (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u');
//         
//             if(Character.isLetter(alphabet) && !isVowel){   
//                
//                consonant += alphabet;
//                
//                consonantCounter++;            
//            }
//        
//    
//    
//        }
//    
//    System.out.printf("The consonant in the sentence is: %s%n",  consonant);
//    System.out.printf("The number of consonant in the sentence is: %d%n", consonantCounter);
//    }
//    
//    
//}




//public class LearnChar{
//
//    public static void main(String[] args){
//    
//        String text = "Matthew Is A Good Man";
//        
//        String vowelsOnly = "";
//        
//        String consonantOnly = "";
//        
//        int vowelCounter = 0;
//        
//        int consonantCounter = 0;
//        
//        for(int count = 0; count < text.length(); count++){
//        
//        char alphabet = Character.toLowerCase(text.charAt(count));
//        
//            if (Character.isLetter(alphabet)){
//            
//                if(alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u'){
//                
//                    vowelsOnly += alphabet;
//                    vowelCounter++;
//                
//                }else{
//                
//                    consonantOnly += alphabet;
//                    consonantCounter++;
//                }
//            
//            }
//        
//        
//        }
//    System.out.printf("The vowels in the sentence are: %s%n", vowelsOnly);
//    System.out.printf("The number of vowels in the sentence are: %d%n", vowelCounter);
//    System.out.printf("The consonant in the sentence are: %s%n", consonantOnly);
//    System.out.printf("The number of vowels in the sentence are: %d%n", consonantCounter);    
//    }
//}
//



public class LearnChar{

    public static void main(String[] args){
    
        String text = "Matthew Is A Good Man";

        String reversed = "";
        
        for(int count = text.length() - 1; count >= 0; count--){
        
        char alphabet = Character.toUpperCase(text.charAt(count));
        
            reversed += alphabet;

        }
     
     System.out.println(reversed); 
    }

}








































































