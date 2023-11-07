# An isogram is a word that has no repeating letters, consecutive or non-consecutive. 
# Implement a function that determines whether a string that contains only letters is an isogram.
# Assume the empty string is an isogram. Ignore letter case.

# Example: (Input --> Output)

# "Dermatoglyphics" --> true "aba" --> false "moOse" --> false (ignore letter case)

# isIsogram "Dermatoglyphics" = true
# isIsogram "moose" = false
# isIsogram "aba" = false

##########################################################################################################
# My solution
##########################################################################################################
def is_isogram(string):
    string = string.lower()
    cleanString = [char for char in string if char.isalpha()]
    uniqueString = set(cleanString)
    if (len(uniqueString) == len(cleanString)):
        return True
    else:
        return False