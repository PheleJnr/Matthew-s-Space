
//My Arithmetic Application

//Generate the first Random number

//Generate the second Random Number

//check that the second random number is not higher than the first random number

or

//Generate the first Random number

//Generate the second Random Number that cannot be higher than the first random number



Display the subtraction of the second number from the first number as a question

create a time reference to keep track of the amount of time spent on the whole questions

Allow the user to enter an answer for the question 

Take the answer and assign it to a reference or a container 

calculate and get the result of the subtraction of the second number from the first number

Assign the result of the above calculation to a reference or container called correct-answer

compare the user's inputted answer to correct-answer

create a reference that keeps track of the number of accurately answered questions called score

increase the value of the score by one for every correct answer question by the user

Give the user two attempts when they answer wrongly before moving to the next questions

Repeat the entire process ten times and for each time you track the value of score

Display score

Display the total amount of time spent on the whole question








#16th September 2026

#Filter Function

liked_foods = ["Rice", "CocoYam" "spag" "noodle"]



foods =[Rice,egusi, okpa-ibi, beans garrium cocoyam, amala spag Agidi oat]


def is_food_not_liked(food):

    return food not in liked_foods



unliked_foods = list(filter(is_food_not_liked, foods))

print("All foods: ", foods "\n")

print("unliked_foods: ", unliked_foods, "\n")
print("liked_foods: ", liked_foods)

text = "Hello Semicolon Native"

    def is_upper_case(letter):
    
        return letter.isupper()



upper_cased_letters = list(filter(is_upper_case, text))

upper_cased_letters = "".join(upper_cased_letters)

print("upper: ", upper_cased_letters)



#MAP

def to_upper(food):

    return food.upper()
    
    

food_in_uppercase = list(map(to_upper, unliked_foods))

print(food_in_uppercase)



numbers = [4,9,25,8,34,7,44,36,2]

def is_perfect_square(number):

    return (number ** 0.5) % 1 == 0

print(list(map(is_perfect_square, numbers)))



#Reduce

from functools import reduce


def sum_up(accumulator, number):

    return accumulator + number
    
    
    
numbers = [4,9,25,8,34,7,44,36,2]

result = reduce(sum_up, numbers)

print(result)























