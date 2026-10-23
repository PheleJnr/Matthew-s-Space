import unittest

from arithmetic_functions import *

class SimpleArithmeticTest(Unittest.TestCase):

    def test_that_a_number_is_generated_randomly(self):
    
        lower_range = 50
        
        higher_range = 100
        
        random_number = generate_random_number(lower_range, higher_range)
        
        self.assertTrue(random_number < higher_range)
        self.assertTrue(random_number >= lower_range)
        
        
        
    def test_that_get_question_function_returns_two_random_numbers_for_the_question(self):
    
        
