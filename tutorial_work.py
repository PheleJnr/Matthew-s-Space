#age = 23
#int age = 23;
#
#sum = sum + number 
#sum += number 
#
#number1 = 6
#number2 = 10 
#
#sum = number1 + number2
# print(sum)
# 
# 
#average = sum / 2
#
#print("The Average number is: ", average end="\t")


#number = int(input("Enter first number "))

#if 1024 % 4 == 0:
#    print("it's a Multiple of 4")
#        
#else:
#    print("else it is not a multiple of 4")
#    
#if 10 % 2 == 0:
#    print("its a multiple of 2")
#
#else:
#    print("its not a multiple of 2")    


#number2 = int(input("Enter second number "))
#
#number3 = int(input("Enter third number: "))

#sum = number1 + number2 
#
#average = sum / 2
#
#average = average + number1
#
#print("Sum of numbers: ", sum)
#print("The average of numbers: ", average)
#
#if single selection 
#if else double 
#if elif else
#
#
#
#if (age > 18):
#


#if (number1 == number2):
#    print(number1, "is equal to", number2)
#


#for (number = 1; number <= 5; number++)

#for number in range(1, 6):
#    
#

#if number1 <= value and number2 


#hello world
#hello world
#hello world
#hello world
#hello world
#

#int number = 25 
#
#number = 25
#

#largest = number3
#
#if number1 > largest:
#    largest = number1
#    
#if number2 > largest:
#    largest = number2

#smallest = min(number1, number2, number3)
#
#
#print("The smallest number: ", smallest)
#

#print("number\t Square\tcube")
#
#for number in range(0, 6):
#
#    square = number * number
#
#    cube = number * number * number
#
#    print(number, square, cube, sep="\t")



#for number in range (1, 13):
#
#    for value in range (1, 13):
#    
#        total = value * number
#    
#        print(f"{value} x {number} = {total}", end="\t")
#    print()
#


#for row in range(10):
#    for column in range(10):
#        print('<' if row % 2 == 1 else '>', end='')
#    print()

#for row in range (2):
#    for column in range (7):
#        print('@', end=" ")
#    
#    print()




#def minimum_array(numbers):
#
#    smallest = numbers[0]           
#
#    for index in range(1, len(numbers)):  
#      
#        if numbers[index] < smallest:
#            smallest = numbers[index]
#
#    return smallest
#
#
#numbers = [5, 2, 7, 10, 60]
#
#print(minimum_array(numbers))






def maximum_array(numbers):

    largest = numbers[0]
    
    for index in range(1, len(numbers)):
    
        if numbers[index] > largest:
        
            largest = numbers[index]
            
    return largest
    


def sort_array(numbers):

    length = len(numbers)
    
    for value in range(length - 1):
    
        for check in range(length - 1 - value):
        
            if numbers[check] > numbers[check + 1]:
    
                temp = numbers[check]
                
                numbers[check] = numbers[check + 1]
                
                numbers[check + 1] = temp
                
    return numbers                


numbers = [34, 100, 67, 89, 45, 52]

print(sort_array(numbers))

print(maximum_array(numbers))        


















































