// Return the number (count) of vowels in the given string.

// We will consider a, e, i, o, u as vowels for this Kata (but not y).

// The input string will only consist of lower case letters and/or spaces.

///////////////////////////////////////////////////////////////////////////////////////////////////////
// My solution
///////////////////////////////////////////////////////////////////////////////////////////////////////
#include <stddef.h>
#include <stdio.h>

size_t get_count(const char *s)
{
  unsigned short count = 0;
  unsigned short i = 0;
  while (s[i] != '\0'){
    if (s[i] == 'a' || s[i] == 'o' || s[i] == 'e' || s[i] == 'i' || s[i] == 'u'){
      count ++;
    }
    i++;
  }
  return count;
}