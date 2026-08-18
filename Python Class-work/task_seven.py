for number in range (1, 11):

    if (number % 4 == 0):
        sum = 0 
        for repeat in range (1, 6):                
            power = number ** repeat
            sum = sum + power

        print(sum, end= " ") 


            
