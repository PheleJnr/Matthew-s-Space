def numberOfOccurence(word, letter):
    
    counter = 0;
        
    for char in word:
           
        if char == letter:
            
            counter += 1
          
        
    return counter;  
    
word = "Village People"
letter = 'e'
print(numberOfOccurence(word,letter))
 
    
  
