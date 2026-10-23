def check_for_palindrome(word):

    results = []
    
    for text in word:
    
        word = text.lower()
        
        reverse = word[::-1]
        
        if (word == reverse):
            
            results.append(True)
            
        else:
        
            results.append(False)
            
    return results
    
    
word = ["Madam", "hello", "noon", "racecar"]  

print(check_for_palindrome(word))
    
    

    
