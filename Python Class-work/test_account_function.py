#import unittest

from unittest import TestCase

#importfrom account_functions

from account_functions import *

class AccountTest(TestCase):

#    def test_sample(self):
    
#        result = 15
#        
#        first_number = 10
#        
#        second_number = 5
#        
#        summation = first_number + second_number
#        
#        self.assertTrue(summation == result)
#
#        self.assertEqual(summation, result)#


    
    def test_accountBalance_isZero_duringCreation(self):
    
        expected_balance = 0
        
#        actual_balance = account_functions.check_balance()
        actual_balance = check_balance(0.0)

        self.assertEqual(actual_balance, expected_balance)





    def test_thatAccount_canBeDepositedInto_afterCreation(self):
    
        amount = 500.00
    
        self.assertEqual(0.0, check_balance(0.0))
        
        balance = deposit(amount, 0.0)
    
        
        self.assertEqual(500.00, check_balance(balance))
        
        

    def test_depositTwice_thatAccountCanBeDepositedInto_twice(self):

        first_amount = 3000.00
    
        second_amount = 2500.00
        
        initial_bal = 0.0
    
        self.assertEqual(0.0, check_balance(initial_bal))
    
        balance = deposit(first_amount, initial_bal)
    
        self.assertEqual(3000.00, check_balance(balance))
    
        second_balance = deposit(second_amount, balance)
    
        self.assertEqual(5500, check_balance(second_balance))



    def test_DepositNegativeAmount_balanceRemains_unchanged(self):
    
        initial_bal = 0.0
        
        self.assertEqual (0.0, check_balance(initial_bal))

        new_balance = deposit(3500, initial_bal)
        
        self.assertEqual(3500, check_balance(new_balance))

        unchanged_balance = deposit(-200, new_balance)
        
        self.assertEqual(3500, check_balance(unchanged_balance))
        
        
    def test_thatAccountWithdrawal_withdrawAccurate_Amount(self):
    
        initial_bal = 0.0
        
        balance = deposit(5000, initial_bal)
        
        self.assertEqual(balance, 5000.00)
        
        new_balance = withdraw(3000, balance)
        
        self.assertEqual (new_balance, 2000.0)
        
        
    def test_that_AccountWithdrawal_is_not_above_balance(self):
    
        initial_bal = 0.0
        
        balance = deposit(3000, initial_bal)
        
        self.assertEqual(balance, 3000)
        
        new_balance = withdraw(5000, balance)
        
        self.assertEqual(new_balance, 3000)
        
        self.assertTrue(new_balance == 3000.0)
        
        
    def test_that_AccountWithdraw_withrawsValid_Amount(self):
    
        initial_bal = 0.0
        
        balance = deposit(3000, initial_bal)
        
        self.assertEqual(balance, 3000)
        
        new_balance = withdraw (-7000, balance)
        
        self.assertEqual(new_balance, 3000.00)
    
       

























