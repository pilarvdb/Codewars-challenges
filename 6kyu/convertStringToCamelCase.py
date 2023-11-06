# Complete the method/function so that it converts dash/underscore delimited words into camel casing. 
# The first word within the output should be capitalized only if the original word was capitalized 
# (known as Upper Camel Case, also often referred to as Pascal case). 
# The next words should be always capitalized.

# Examples
# "the-stealth-warrior" gets converted to "theStealthWarrior"

# "The_Stealth_Warrior" gets converted to "TheStealthWarrior"

# "The_Stealth-Warrior" gets converted to "TheStealthWarrior"

#############################################################################################################
# My solution
#############################################################################################################

def remove_ithe_character(s, i):
    if i==0:
        return s[1:]
    return s[0] + remove_ithe_character(s[1:], i-1)

def capitalize(s, ind):
    split_s = list(s)
    split_s[ind] = split_s[ind].upper()
    return "".join(split_s)

def to_camel_case(text):
    i = 0
    while (i < len(text)):
        if text[i] == '-':
            text = remove_ithe_character(text, i)
#             check this was not the last char
            if (i < len(text)):
                text = capitalize(text, i)
        if text[i] == '_':
            text = remove_ithe_character(text, i)
#             check this was not the last char
            if (i < len(text)):
                text = capitalize(text, i)
        i = i + 1
    return text