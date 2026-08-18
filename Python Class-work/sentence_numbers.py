word = input("Enter a word sentence: ")


vowel_counter = 0
consonant_counter = 0
uppercase_counter = 0
lowercase_counter = 0
symbol_counter = 0
space_counter = 0

for character in word:

    if (character == 'a' in character == 'e' in character == 'i' in character == 'o' in character == 'u'):
            vowel_counter += 1

    elif (character.isalpha()):
            consonant_counter += 1

    elif (character.isupper()):
            uppercase_counter += 1

    elif (character.islower()):
            lowercase_counter += 1

    elif (character.isspace()):
            space_counter += 1

    else: (character.issymbols())
    symbol_counter += 1


    print ("Vowels: " + [vowel_counter])
    print ("consonants: " + [consonant_counter])
