


from account_functions import *

def main():

    balance = 0
    
    print("Welcome to ORION Account.....")
    
    menu = """
    
    
        1. check_balance
        
        2. Deposit
        
        3. Withdraw
        
        0. exit
        
    """
    
    tracker = 1
    
    while (tracker != 0):
    
        choice  = input(f"{menu}\nEnter Your Choice: ")
        
        match choice:
        
            case "1":
            
                    current_balance = check_balance(balance)
                    print(f"Your Account Balance: {current_balance}")
                    
            case "2":
                    
                    amount = input("Enter Your Amount to Deposit: ")
                    
                    for digit in amount:
                    
                        if not digit.isdigit():
                        
                            print(Invalid)
                            break
                            
                    else: 
                    
                        amount = float(amount)   
                    
                    new_balance = deposit(amount, balance)
                    
                    if new_balance == balance:
                    
                        print("Invalid Amount Inputted")
                        
                    else:
                    
                        balance = new_balance
                        
                        print("Deposit was Successful")
                        
                        
            case "3":
                    
                    amount = float(input("Enter Your Amount to Deposit: "))
                    
                    new_balance = withdraw(amount, balance)
                    if new_balance == balance
                            print("Invalid Amount Inputted")
                            
                    else: 
                        
                        balance = new_balance
                        print("Withdrawal was successful")     
                        
                        
                        
                    
                    
           case "0":
                 
                   print("Oya Go Rest!!!!")
                   tracker = 0
                   
           case _ : print("Pls Get sense !!!!")       
           
           
    if_name_ == "_main_":
    
        main()    
                    
                    
                    
                    
                    
                    
                    
                    
                       
                        
