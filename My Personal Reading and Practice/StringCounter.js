function numberOfOccurence(word, letter){
    
        let counter = 0;
        
        for(let count = 0; count < word.length; count++){
            
            if(word.charAt(count) == letter){
            
                counter++;
            }
        }
        return counter;   
    }
    
    
let word = "Village People";
let letter = 'e';    
console.log(numberOfOccurence(word, letter));



