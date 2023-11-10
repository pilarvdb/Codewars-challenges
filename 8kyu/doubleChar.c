// Given a string, you have to return a string in which each character (case-sensitive) is repeated once.

// Examples (Input -> Output):
// * "String"      -> "SSttrriinngg"
// * "Hello World" -> "HHeelllloo  WWoorrlldd"
// * "1234!_ "     -> "11223344!!__  "
// Good Luck!

////////////////////////////////////////////////////////////////////////////////////////////////////////////
// My solution
////////////////////////////////////////////////////////////////////////////////////////////////////////////

#include <string.h>
#include <stdio.h>

char *double_char (const char *string, char *doubled)
{
  unsigned int j = 0;
  unsigned int i = 0;
  do{
    doubled[j] = string[i];
    j++;
    doubled[j] = string[i];
    j++;
    i++;
  } while(string[i] != '\0');
  doubled[j] = '\0';
  
  return doubled;
}