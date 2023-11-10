// Complete the solution so that it returns true if the first argument(string) passed in ends with the 
// 2nd argument (also a string).

// Examples:

// solution('abc', 'bc') // returns true
// solution('abc', 'd') // returns false

////////////////////////////////////////////////////////////////////////////////////////////////////////////
// My solution
////////////////////////////////////////////////////////////////////////////////////////////////////////////
#include <stdbool.h>
#include <string.h>
#include <stdio.h>
#include <stdlib.h>

bool solution(const char *string, const char *ending)
{
  unsigned short sizeEnding = strlen(ending);
  if (sizeEnding > strlen(string)) return false;
  
  char *endingOriginal ;
  endingOriginal = malloc(sizeEnding * sizeof(char));
  if (endingOriginal == NULL) return false;
  
  memcpy(endingOriginal, &string[strlen(string)-sizeEnding], sizeEnding);
  return (strcmp(endingOriginal,ending) == 0);
}