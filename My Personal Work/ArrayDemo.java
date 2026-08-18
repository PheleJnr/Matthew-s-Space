public class ArrayDemo {

    public static void main (String[] args){
    
   //this is simply a declaration of an array while marks there is an object reference. This means we have only declared but no memory allocation has been done.
   
    double[] marks;
    
   /*This is now initialisation of an array, where we instantiate the variable to make an allocation for the data we want to keep in the memory. So to allocate memory for an array of element we have to instantiate a new array with data type with the "new" keyword and the data type and size of the array we want to create.
  
   double - the data type
   marks - the array name/ object reference
   new - is the keyword representing we are creating a new memory space for an object
   double [5] - this denote that 5 elements of data type double has been created
   
   the  default value is 0 for all the array index which house (0.0d for double, 0.0f for float, 0 for int data type, false for boolean data type and so on 
   
   double [] marks = new double [5]; --- This line of code means we have instantiate an array of the name marks of data type double and allocated it a memory space.
   
   Now we want to initialise that memory allocated space by storing the actual values in them 
   
   double[] marks = new double[] {34.5, 78.2, 99.8, 44.5 56 } ----- this declaring, instantiating and initialising an array in a single step 
   
   {34.5, 78.2, 99.8, 44.5 56 } ---- this is an array initialiser
   
   double[] marks;
   marks = {34.5, 78.2, 99.8, 44.5 56 } ---- this is not allowed in java, declaring and intialising in a different line of code is not allowed because we have already declared marks which is an object reference it cannot directly stores the values of these arrays without actually creating the array object.
      */
   
   
    
    double [] marks = new double [5];
    
    
   
   
    
    
    
    
    
    
    
    
    
    
    
    
    }

}
