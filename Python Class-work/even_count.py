def count_even(array):

    count = 0
    new_arrays = []
    for numbers in array:

        if numbers % 2 == 0:
            new_arrays.append(numbers)
            count += 1
    new_arrays.append(count)
    return new_arrays

new_arrays = [1, 2, 3, 4, 5]

print(count_even(new_arrays))


