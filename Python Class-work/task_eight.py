for number in range (1, 11):
    
    
    if (number % 4 == 0):
        sum = 0 
        total = 0 
        for repeat in range (1, 6): 

            total = 0              
            power = number ** repeat
            sum = sum + power
    
            total = total + sum
        print(total, end= " ") 

