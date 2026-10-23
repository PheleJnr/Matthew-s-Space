def get_unique_element(array):

    unique_count = 0

    for count in range(len(array)):
    
        occurrence_counter = 0

        for index in range(len(array)):
        
            if index != count and array[index] == array[count]:
            
                occurrence_counter += 1

        if occurrence_counter == 0:
        
            unique_count += 1

    new_array = [0] * unique_count
    
    result_index = 0
    
    total_sum = 0

    for count in range(len(array)):
    
        occurrence_counter = 0

        for index in range(len(array)):
        
            if index != count and array[index] == array[count]:
            
                occurrence_counter += 1

        if occurrence_counter == 0:
        
            new_array[result_index] = array[count]
            
            result_index += 1
            
            total_sum += array[count]

    return new_array


#result = get_unique_element(array)
#print("Unique elements: ", result)
#print("The Sum of UniqueElements: ", sum(result))
#    

#if __name__ == "__main__":
#    array = [1,2,3,2]
#    result = get_unique_element(array)
#    print("Unique elements: ", result)
#    print("The Sum of UniqueElements: ", sum(result))
#    
#    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
