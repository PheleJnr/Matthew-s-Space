import unittest

from palindrome import *

class PalindromeTest(unittest.TestCase):

    def test_that_a_word_is_palindrome_and_it_returns_true(self):
    
        word = ["Madam", "hello", "noon", "racecar"]
        
        expected = [True, False, True, True]
        
        actual = check_for_palindrome(word)
        
        self.assertListEqual(expected, actual)
