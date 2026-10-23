
"""
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

"""


import random 
import time


def generate_random_number(lower_band, higher_band):

    generated_number = random.randrange(lower_band, higher_band)
    
    return generated_number
    
 

def get_questions():

    first_number = generate_random_number(100, 500)
    
    second_number = generate_random_number (50, first_number)
    
    question = [first_number, second_number]
    
    return question


def calculate_question(first_number, second_number):

    return first_number - second_number
    
    
def calculate_time_taken(start_time, end_time):

    return end_time - start_time















