# A pangram is a sentence that contains every single letter of the alphabet at least once. 
# For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram, because it uses 
# the letters A-Z at least once (case is irrelevant).

# Given a string, detect whether or not it is a pangram. Return True if it is, False if not. 
# Ignore numbers and punctuation.

###########################################################################################################
# My solution
###########################################################################################################
def is_pangram(s):
    s = s.lower()
    cleanString = [char for char in s if char.isalpha()]
    uniqueString = set(cleanString)
    if (len(uniqueString) == 26):
        return True
    else:
        return False