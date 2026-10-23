from arithmetic_functions import calculate_question, get_questions

exit = 1

menu = """
    
        Welcome To Simple Arithmetic Application
        
        1. Take Questions
        
        0. Exit
        
        """
        
        
print(menu)
        
user_choice = input("Enter option: ")
        

while (exit != 0):

    
        if user_choice == "1":
        
            score = 0
            
            for _ in range(10):
        
                first_number, second_number = get_questions()
                
                user_answer = int(input(f"solve : \n\t {first_number} - {second_number}\n\t Answer: "))
                
                result = calculate_question(first_number, second_number)
                
            if user_answer == result:
                
                score += 1
            
                print(f"Your Score is {score}")
            
            to_continue = input("Do you wish to continue: Yes/No ")
            
            if to_continue.lower() == "yes":
            
                continue
                
            else: 
            
                print("You don try!!! \n Oya go rest")
                
                exit = 0
                                  
                
        else:
        
            exit = 0
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            


