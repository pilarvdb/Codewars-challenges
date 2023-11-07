# Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.

# Examples
# pig_it('Pig latin is cool') # igPay atinlay siay oolcay
# pig_it('Hello world !')     # elloHay orldway !

#####################################################################################################
# My solution
#####################################################################################################

def isFirstLetter(char, i, text):
    if (char.isalpha() and i == 0):
        return True
    elif (char.isalpha() and not(text[i-1].isalpha())):
        return True
    else:
        return False
    
def isLastLetter(char, i, text):
    if (char.isalpha() and i == len(text)-1):
        return True
    elif (char.isalpha() and not(text[i+1].isalpha())):
        return True
    else:
        return False
    
def lastNonChar(text):
    i = len(text)-1
    tail = str()
    while(not(text[i].isalpha()) and i>=0):
        tail = text[i] + tail
        i = i - 1
    return tail
    
def pig_it(text):
    newText = str()
    j = 0
    prevLastWordIndex = 0
    indexLastLetter = 0
    for i in range(len(text)):
        if (isFirstLetter(text[i], i, text)):
            firstLetter = text[i]
            indexFirstLetter = i
            j = j+1
        if (isLastLetter(text[i], i, text)):
            prevLastWordIndex = indexLastLetter
            indexLastLetter = i
            newText = newText + text[prevLastWordIndex+1:indexFirstLetter] + text[indexFirstLetter+1:indexLastLetter+1] + firstLetter + "ay"
            j = j + 3
        else:
            j = j+1
    tail = lastNonChar(text)
    newText = newText + tail
    return newText