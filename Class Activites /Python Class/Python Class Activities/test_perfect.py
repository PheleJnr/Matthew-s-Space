import unittest

from perfect import *

class PerfectTest(unittest.TestCase):

    def test_that_a_perfect_number_returns_true(self):
    
        numbers = [0, 1, 4, 9, 16, 25, 49]
        
        expected = [True, True, True, True]
        
        actual = find_perfect_square(numbers)
        
        self.assertEqual(expected, actual)
        
    def test_that_a_non_perfect_number_returns_false(self):
    
        numbers = [8,36,49,5]
        
        expected = [False, True, True, False]
        
        actual = find_perfect_square(numbers)
        
        self.assertListEqual(expected, actual)
