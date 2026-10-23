def factorial(number):

    result = 1
    
    for value in range(2, number + 1):
    
        result *= value
        
    return result



def greatestCommonDivisor(numberOne, numberTwo):

    while numberTwo != 0:
    
        remainder = numberOne % numberTwo
        
        numberOne = numberTwo
        
        numberTwo = remainder
        
    return numberOne



def lowestCommonDivisor(numberOne, numberTwo):

    larger = numberOne if numberOne > numberTwo else numberTwo
    
    multiple = larger

    while True:
    
        if multiple % numberOne == 0 and multiple % numberTwo == 0:
        
            return multiple
            
        multiple += larger



def is_perfect_number(number):

    if number <= 1:
    
        return False

    sum_of_divisors = 0
    
    for divisor in range(1, number // 2 + 1):
    
        if number % divisor == 0:
        
            sum_of_divisors += divisor

    return sum_of_divisors == number



def _count_digits(number):

    count = 0
    
    while number > 0:
    
        count += 1
        
        nnumber //= 10
        
    return count



def _raise_to_power(base, exponent):

    result = 1
    
    for _ in range(exponent):
    
        result *= base
        
    return result



def is_armstrong_number(number):

    digit_count = _count_digits(number)
    
    original = number
    
    total = 0

    while number > 0:
    
        digit = number % 10
        
        total += _power(digit, digit_count)
        
        number //= 10

    return total == original



def count_armstrong_in_range(start, end):

    counter = 0
    
    for count in range(start, end + 1):
    
        if is_armstrong_number(count):
        
            counter += 1
            
    return counter


def find_armstrong_in_range(start, end):

    result = []
    
    for count in range(start, end + 1):
    
        if is_armstrong_number(count):
        
            result.append(count)
            
    return result



def count_perfect_in_range(start, end):

    counter = 0
    
    for count in range(start, end + 1):
    
        if is_perfect_number(count):
        
            counter += 1
            
    return counter


def find_perfect_in_range(start, end):

    result = []
    
    for count in range(start, end + 1):
    
        if is_perfect_number(count):
        
            result.append(count)
            
    return result



def is_strong_number(number):

    original = number
    
    total = 0

    while number > 0:
    
        digit = number % 10
        
        total += factorial(digit)  
        
        number //= 10

    return total == original



def _is_leap_year(year):

    return (year % 4 == 0 and year % 100 != 0) or (year % 400 == 0)



def find_leap_years_in_range(start, end):

    result = []
    
    for year in range(start, end + 1):
    
        if _is_leap_year(year):
        
            result.append(year)
            
    return result



def count_leap_years_in_range(start, end):

    counter = 0
    
    for year in range(start, end + 1):
    
        if _is_leap_year(year):
        
            counter += 1
            
    return counter








