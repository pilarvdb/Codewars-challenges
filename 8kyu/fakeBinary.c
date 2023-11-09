// Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'. 
// Return the resulting string.

// Note: input will never be an empty string

//////////////////////////////////////////////////////////////////////////////////////////////////////
// My solution
//////////////////////////////////////////////////////////////////////////////////////////////////////

#include <string.h>
#include <stdio.h>
#include <stdlib.h>

// Please place result in the memory pointed to by
// the binary parameter. binary has enough memory to
// accommodate the answer as well as the null-terminating
// character.
void fakeBin(const char *digits, char *binary) {
  
  for (unsigned int i=0; i < strlen(digits); i++){
    int value = digits[i]-'0';
    if (value >= 5) *(binary+ i)='1';
    else *(binary + i)='0';
  }
 	*(binary + strlen(digits)) = '\0';
}